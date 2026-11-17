package com.jsp.lovable_clone.dto.member;

import com.jsp.lovable_clone.enums.ProjectRole;

public record UpdateMemberRoleRequest(
        ProjectRole role) {
}
