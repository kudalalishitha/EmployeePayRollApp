package com.bridgelabz.employeepayrollapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmployeeDTO {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 1, message = "Salary must be greater than 0")
    private double salary;
}
