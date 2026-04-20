# Environment Setup

## Tech Stack
- Java 21
- Spring Boot 3.4.1
- Spring Ai (MCP Server)
- Gradle
- H2 Database

Spring Boot 3.4.1을 사용한 이유는 Spring AI 1.1.4와의 호환성을 목적으로 설계하였다.

---

# claude_desktop_config.json

```json
{
    "mcpServers" : {
        "employee-mcp-server": {
            "command": "npx",
            "args": [
                "-y",
                "mcp-remote",
                "http://localhost:8080/sse"
            ]   
        }
    }
}
```
