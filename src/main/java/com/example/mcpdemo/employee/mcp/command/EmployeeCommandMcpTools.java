package com.example.mcpdemo.employee.mcp.command;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeCommandMcpTools {

    @Tool(description = "새로운 직원을 추가합니다")
    public String addEmployee(
            @ToolParam(description = "직원 이름") String name,
            @ToolParam(description = "부서명") String department,
            @ToolParam(description = "연봉 (단위: 원)") Long salary) {
        employeeService.save(name, department, salary);
        return name + " 직원이 추가되었습니다.";
    }

    @Tool(description = "직원 ID로 직원을 삭제합니다")
    public String deleteEmployee(
            @ToolParam(description = "삭제할 직원 ID") Long id) {
        employeeService.deleteById(id);
        return id + "번 직원이 삭제되었습니다.";
    }
}
