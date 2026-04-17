package com.example.mcpdemo.employee.service.command;

import com.example.mcpdemo.employee.domain.Employee;
import com.example.mcpdemo.employee.dto.result.EmployeeResult;
import com.example.mcpdemo.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeCommandService {

    private final EmployeeRepository employeeRepository;

    public EmployeeResult save(String name, String department, Long salary){
        Employee employee = Employee.create(name, department,salary);
        employeeRepository.save(employee);

        return EmployeeResult.from(employee);
    }

    public void deleteById(Long id){
        employeeRepository.deleteById(id);
    }
}
