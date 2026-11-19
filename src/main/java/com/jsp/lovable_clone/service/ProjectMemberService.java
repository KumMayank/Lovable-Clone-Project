package com.jsp.lovable_clone.service;

import com.jsp.lovable_clone.dto.member.InviteMemberRequest;
import com.jsp.lovable_clone.dto.member.MemberResponse;
import com.jsp.lovable_clone.dto.member.UpdateMemberRoleRequest;

import java.util.List;

public interface ProjectMemberService {
   List<MemberResponse> getProjectMembers(Long projectId, Long userId);

//    List<ProjectMember> getProjectMember(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, InviteMemberRequest request, Long userId);
}
