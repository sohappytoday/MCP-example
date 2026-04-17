package com.example.mcpdemo.employee.dto.response;

import com.example.mcpdemo.employee.dto.result.EmployeeResult;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class EmployeeResponse {
    List<EmployeeResult> employees;

    public static EmployeeResponse from(List<EmployeeResult> results){
        return EmployeeResponse.builder()
                .employees(results)
                .build();
    }
}
