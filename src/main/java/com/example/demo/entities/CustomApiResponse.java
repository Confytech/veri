package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CustomApiResponse {
    private String status;
    private String message;
    private String accountNumber;
    private String accountOwner;

    public CustomApiResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }
    // other fields, getters, setters
}