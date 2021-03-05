package com.example.claimsservice.resource;

import com.example.claimsservice.model.Claim;
import com.example.claimsservice.service.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/")
public class ClaimsResource {

    @Autowired
    private ClaimsService claimsService;

    @GetMapping("/claim/{memberId}")
    public ResponseEntity<Claim> getClaims(@PathVariable final String memberId) {

        Claim claim = claimsService.retrieveClaim(memberId);

        return ResponseEntity.ok().body(claim);
    }

    @PostMapping("/claim")
    public ResponseEntity<?> saveClaim(@RequestBody final Claim claim) {

        claimsService.saveClaim(claim);

        return ResponseEntity.ok().body(claim);
    }
}
