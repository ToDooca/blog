package xyz.todooc4.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.todooc4.blog.data.dto.LoginRequest;
import xyz.todooc4.blog.data.dto.RegisterRequest;
import xyz.todooc4.blog.security.AuthSecurity;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthSecurity authSecurity;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest) {
        authSecurity.signup(registerRequest);
        return  new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
       return authSecurity.login(loginRequest);
    }
}
