package com.example.testApplication.dto;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "PERSON")
public class Person {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Department")
    private String department;

    @Column(name = "Position")
    private String position;

    @Column(name = "Age")
    private Integer age;

}
