package com.example.mcpdemo.config;

import com.example.mcpdemo.employee.mcp.command.EmployeeCommandMcpTools;
import com.example.mcpdemo.employee.mcp.query.EmployeeQueryMcpTools;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbacks;
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
    public List<ToolCallback> employeeTools() {
        return List.of(ToolCallbacks.from(
                employeeQueryMcpTools,
                employeeCommandMcpTools
        ));
    }
}
