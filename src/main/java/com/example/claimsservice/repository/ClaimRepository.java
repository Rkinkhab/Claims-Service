package com.example.claimsservice.repository;

import com.example.claimsservice.model.Claim;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClaimRepository extends MongoRepository<Claim, String> {

    public Claim findByMemberId(String memberId);

    public void deleteByMemberId(String memberId);
}
