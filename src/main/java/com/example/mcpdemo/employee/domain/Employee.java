package com.example.mcpdemo.employee.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.*;

@Entity
@NoArgsConstructor
@Getter
public class Employee {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    private String name;

    private String department;

    private Long salary;

    private Employee(String name, String department, Long salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static Employee create(String name, String department, Long salary) {
        return new Employee(name, department, salary);
    }
}
