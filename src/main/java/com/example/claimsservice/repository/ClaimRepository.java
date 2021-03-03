package com.example.claimsservice.repository;

import com.example.claimsservice.model.Claim;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ClaimRepository extends MongoRepository<Claim, String> {

    public Claim findByMemberId(String memberId);

    @Query(value="{'claimId' : $0}", delete = true)
    public boolean deleteByClaimId(String claimId);
}
