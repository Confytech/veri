package com.example.demo.controller;

import com.example.demo.entities.ApiRequest;
import com.example.demo.entities.CustomApiResponse;
import com.example.demo.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class AccountVerification {



    private final AccountService accountService;

    @PostMapping("/verify-account")
    public ResponseEntity<CustomApiResponse> verifyAccount(@RequestBody ApiRequest request) {
        CustomApiResponse response = accountService.bankVerification(request);
        return ResponseEntity.ok(response);
    }
}
