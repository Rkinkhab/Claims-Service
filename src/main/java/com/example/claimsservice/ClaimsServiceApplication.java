package com.example.claimsservice;

import com.example.claimsservice.model.Claim;
import com.example.claimsservice.service.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class ClaimsServiceApplication implements CommandLineRunner {

    @Autowired
    private ClaimsService claimsService;

    public static void main(String[] args) {
        SpringApplication.run(ClaimsServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        String date = new Date().toString();
        ArrayList<Claim> claimList = new ArrayList<>(Arrays.asList(new Claim("1", "Lipitor", "00710156", "Branded", "KING", "CVS", new Date().toString(), 25.0, "1"),
                new Claim("2", "Accuretic", "00710222", "Branded", "KING", "CVS",date, 23.50, "2"),
                new Claim("3", "Nardil", "00710350", "Branded", "KING", "CVS", date, 24.00, "3"),
                new Claim("4", "Neurontin", "00710401", "Branded", "KING", "CVS", date, 26.35, "4"),
                new Claim("5", "Accupril", "00710530", "Branded", "KING", "CVS", date, 22.15, "5")));


        claimList.forEach(e -> claimsService.deleteByMemberId(e.getMemberId()));
        claimList.forEach(e -> claimsService.saveClaim(e));
    }
}
