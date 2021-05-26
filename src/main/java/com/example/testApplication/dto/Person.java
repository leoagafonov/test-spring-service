package com.example.testApplication.dto;

import com.google.gson.GsonBuilder;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Data
@Table(name = "PERSON")
public class Person {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Name")
    @NotBlank(message = "Name is required")
    @ApiModelProperty(required = true)
    private String name;

    @Column(name = "Department")
    @NotBlank(message = "Department is required")
    @ApiModelProperty(required = true)
    private String department;

    @Column(name = "Position")
    @NotBlank(message = "Position is required")
    @ApiModelProperty(required = true)
    private String position;

    @Column(name = "Age")
    @Max(value = 99, message = "should be less 99")
    @Min(value = 18, message = "should be more 18")
    @ApiModelProperty(example = "min 18, max 99")
    private Integer age;

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
