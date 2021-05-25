package com.example.testApplication.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Branch {

    private ArrayList<String> department;
    private String city;
    private Integer staffCount;
}
