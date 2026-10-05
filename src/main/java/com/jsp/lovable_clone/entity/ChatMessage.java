package com.jsp.lovable_clone.entity;

import com.jsp.lovable_clone.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;
    ChatSession chatSession;

    MessageRole role;


    String content;
    String toolCalls; // JSON Array Tools Called

    Integer tokensUsed;

    Instant createdAt;




}
