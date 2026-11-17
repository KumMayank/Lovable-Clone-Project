package com.jsp.lovable_clone.service;

import com.jsp.lovable_clone.dto.projects.FileContentResponse;
import org.jspecify.annotations.Nullable;

public interface FileService {

    FileService getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
