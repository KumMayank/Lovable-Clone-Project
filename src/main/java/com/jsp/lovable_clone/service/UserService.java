package com.jsp.lovable_clone.service;

import com.jsp.lovable_clone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
     UserProfileResponse getProfile(Long userId);

}
