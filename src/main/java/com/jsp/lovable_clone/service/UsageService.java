package com.jsp.lovable_clone.service;

import com.jsp.lovable_clone.dto.subscription.UsageTodayResponse;
import org.springframework.http.ProblemDetail;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
