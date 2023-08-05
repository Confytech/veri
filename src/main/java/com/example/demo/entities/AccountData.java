package com.example.demo.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class AccountData {
    private String account_number;
    private String account_name;
    // other fields, getters, setters
}