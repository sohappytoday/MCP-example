package com.example.mcpdemo.employee.service.command;

import com.example.mcpdemo.employee.domain.Employee;
import com.example.mcpdemo.employee.dto.result.EmployeeResult;
import com.example.mcpdemo.employee.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
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
