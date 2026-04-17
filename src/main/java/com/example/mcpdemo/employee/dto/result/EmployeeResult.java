package com.example.mcpdemo.employee.dto.result;

import com.example.mcpdemo.employee.domain.Employee;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EmployeeResult {
    String name;
    String department;
    Long salary;

    public static EmployeeResult from(Employee employee){
        return EmployeeResult.builder()
                .name(employee.getName())
                .department(employee.getDepartment())
                .salary(employee.getSalary())
                .build();
    }
}
