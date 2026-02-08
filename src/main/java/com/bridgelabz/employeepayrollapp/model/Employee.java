package com.bridgelabz.employeepayrollapp.model;

import jakarta.persistence.*;
        import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_payroll")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double salary;
}
