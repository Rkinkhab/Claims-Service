package com.example.claimsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Claim")
public class Claim {

    @Id
    private String id;
    private String claimId;
    private String drugName;
    private String drugNDC;
    private String drugType;
    private String prescriberName;
    private String pharmacyName;
    private String createdDate;
    private double claimAmount;
    private String memberId;

    public Claim(String claimId, String drugName, String drugNDC, String drugType, String prescriberName, String pharmacyName, String createdDate, double claimAmount, String memberId) {
        this.claimId = claimId;
        this.drugName = drugName;
        this.drugNDC = drugNDC;
        this.drugType = drugType;
        this.prescriberName = prescriberName;
        this.pharmacyName = pharmacyName;
        this.createdDate = createdDate;
        this.claimAmount = claimAmount;
        this.memberId = memberId;
    }
}
