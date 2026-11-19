package com.jsp.lovable_clone.controller;

import com.jsp.lovable_clone.dto.projects.ProjectRequest;
import com.jsp.lovable_clone.dto.projects.ProjectResponse;
import com.jsp.lovable_clone.dto.projects.ProjectSummaryResponse;
import com.jsp.lovable_clone.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private ProjectService projectService;

    public ResponseEntity<List<ProjectSummaryResponse>> getMyProject(){
        Long userId = 1L; // TODO: update later with real Spring Security
        return  ResponseEntity.ok(projectService.getUserProjects(userId));
    }

    @RequestMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id){
        Long userId = id;
        return ResponseEntity.ok(projectService.getUserProjectById(id, userId));

    }

    @PostMapping
    public ResponseEntity<ProjectResponse> cretaeProject(@RequestBody ProjectRequest request){
        Long userid = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request, userid));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id, @RequestBody ProjectRequest request){
        Long userId = id;
        return ResponseEntity.ok(projectService.updateProject(id, request, userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id){
        Long userId = 1L;
        projectService.setDelete(id, userId);
        return ResponseEntity.noContent().build();

    }

}
