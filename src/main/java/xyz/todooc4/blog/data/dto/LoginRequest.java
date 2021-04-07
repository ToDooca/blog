package xyz.todooc4.blog.data.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
