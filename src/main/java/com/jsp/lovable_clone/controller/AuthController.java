package com.jsp.lovable_clone.controller;

import com.jsp.lovable_clone.dto.auth.AuthResponse;
import com.jsp.lovable_clone.dto.auth.LoginRequest;
import com.jsp.lovable_clone.dto.auth.SignupRequest;
import com.jsp.lovable_clone.dto.auth.UserProfileResponse;
import com.jsp.lovable_clone.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest request){
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile(){
        Long userId = 1L;
        return ResponseEntity.ok(authService.getProfile(userId));

    }



}
