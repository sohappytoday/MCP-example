package com.example.mcpdemo.config;


import com.example.mcpdemo.employee.mcp.command.EmployeeCommandMcpTools;
import com.example.mcpdemo.employee.mcp.query.EmployeeQueryMcpTools;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class McpServerConfig {

    private final EmployeeQueryMcpTools employeeQueryMcpTools;
    private final EmployeeCommandMcpTools employeeCommandMcpTools;

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public ToolCallbackProvider employeeTools() {
        return MethodToolCallbackProvider.builder()
                .toolObjects(employeeQueryMcpTools, employeeCommandMcpTools)
                .build();
    }
}
