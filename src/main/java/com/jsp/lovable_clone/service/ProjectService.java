package com.jsp.lovable_clone.service;

import com.jsp.lovable_clone.dto.projects.ProjectRequest;
import com.jsp.lovable_clone.dto.projects.ProjectResponse;
import com.jsp.lovable_clone.dto.projects.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {

   List<ProjectSummaryResponse> getUserProjects(Long userId);

   ProjectResponse getUserProjectById(Long id, Long userId);

   ProjectResponse createProject(ProjectRequest request, Long userid);

   ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void setDelete(Long id, Long userId);
}
