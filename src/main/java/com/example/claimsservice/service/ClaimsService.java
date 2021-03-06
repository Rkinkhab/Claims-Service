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


    public void deleteByMemberId(String memberId) {
        claimRepository.deleteByMemberId(memberId);
    }

    public void saveClaim(Claim claim) {
        claimRepository.save(claim);
    }
}
