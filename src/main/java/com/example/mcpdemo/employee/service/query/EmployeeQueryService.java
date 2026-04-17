package com.example.mcpdemo.employee.service.query;

import com.example.mcpdemo.employee.domain.Employee;
import com.example.mcpdemo.employee.dto.response.EmployeeResponse;
import com.example.mcpdemo.employee.dto.result.EmployeeResult;
import com.example.mcpdemo.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeQueryService {

    private final EmployeeRepository employeeRepository;

    public List<EmployeeResult> findAll(){
        List<Employee> employees = employeeRepository.findAll();

        return employees.stream()
                .map(EmployeeResult::from)
                .toList();
    }

    public List<EmployeeResult> findByDepartment(String department){
        List<Employee> employees = employeeRepository.findByDepartment(department);

        return employees.stream()
                .map(EmployeeResult::from)
                .toList();
    }

}
