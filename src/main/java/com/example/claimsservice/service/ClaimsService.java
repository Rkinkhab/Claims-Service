package com.example.claimsservice.service;

import com.example.claimsservice.model.Claim;
import com.example.claimsservice.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimsService {

    @Autowired
    private ClaimRepository claimRepository;


    public Claim retrieveClaim(String memberId) {

        return claimRepository.findByMemberId(memberId);
    }

    public void deleteClaimById(String claimId) {
        boolean flag = claimRepository.deleteByClaimId(claimId);
        System.out.println("Claim id : " + flag);
    }


    public void saveClaim(Claim claim) {
        claimRepository.save(claim);
    }
}
