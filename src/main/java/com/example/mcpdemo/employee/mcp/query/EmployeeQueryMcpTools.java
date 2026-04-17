package com.example.mcpdemo.employee.mcp.query;

import com.example.mcpdemo.employee.service.query.EmployeeQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeQueryMcpTools {

    private final EmployeeQueryService employeeQueryService;

    @Tool(description = "전체 직원 목록을 조회합니다")
    public String getAllEmployees() {
        return employeeQueryService.findAll().toString();
    }

    @Tool(description = "특정 부서의 직원 목록을 조회합니다")
    public String getEmployeesByDepartment(
            @ToolParam(description = "조회할 부서명 (예: 개발팀, 마케팅팀)") String department) {
        return employeeQueryService.findByDepartment(department).toString();
    }
}
