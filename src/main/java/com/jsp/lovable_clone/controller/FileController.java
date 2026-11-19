package com.jsp.lovable_clone.controller;

import com.jsp.lovable_clone.dto.projects.FileContentResponse;
import com.jsp.lovable_clone.service.FileService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects/{ProjectId}/files")
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<FileService> getFileTree(@PathVariable Long projectId){
        Long userId = 1L;
        return  ResponseEntity.ok(fileService.getFileTree(projectId, userId));

    }

    @GetMapping("/{*path}")  // /src/hooks/get-user-hooks.jsx
    public ResponseEntity<FileContentResponse> getFile(@PathVariable Long projectId,
                                                       @PathVariable String path){
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFileContent(projectId, path, userId));
    }

}
