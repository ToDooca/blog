package xyz.todooc4.blog.data.dto;

import lombok.Data;

@Data
public class RegisterRequest {

    private String fullName;
    private String username;
    private String displayName;
    private String password;
    private String email;
    private String about;
}
