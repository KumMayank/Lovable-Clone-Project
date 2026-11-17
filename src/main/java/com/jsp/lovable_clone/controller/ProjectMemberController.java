package com.jsp.lovable_clone.controller;


import com.jsp.lovable_clone.dto.member.InviteMemberRequest;
import com.jsp.lovable_clone.dto.member.MemberResponse;
import com.jsp.lovable_clone.entity.ProjectMember;
import com.jsp.lovable_clone.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectid}/members")
@RequiredArgsConstructor  //lombok
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<ProjectMember>> getProjectMembers(
            @PathVariable Long projectId) {

        Long userId = 1L;
        return ResponseEntity.ok(
                projectMemberService.getProjectMembers(projectId, userId)
        );
    }

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMember(
            @PathVariable Long projectId,
            @RequestBody InviteMemberRequest request ){

        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(projectMemberService.inviteMember(projectId, request, userId));

    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId,
            @RequestBody InviteMemberRequest request
    ){

        Long userId = 1l;

        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectId, memberId,request, userId));
    }






}

