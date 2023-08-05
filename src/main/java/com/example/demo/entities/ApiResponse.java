package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ApiResponse {
    private String status;
    private String message;
    private AccountData data;
    // other fields, getters, setters
}