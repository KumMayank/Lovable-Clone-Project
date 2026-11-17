package com.jsp.lovable_clone.service;

import com.jsp.lovable_clone.dto.auth.AuthResponse;
import com.jsp.lovable_clone.dto.auth.LoginRequest;
import com.jsp.lovable_clone.dto.auth.SignupRequest;
import com.jsp.lovable_clone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);

    UserProfileResponse getProfile(Long userId);
}
