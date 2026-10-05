package com.jsp.lovable_clone.entity;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

     Long id;

     String email;
     String passwordHash;
     String name;

     String avatarUrl;

     Instant createdAt;
     Instant updatedAt; //Instant is a Java time type that represents an exact point in time, typically based on UTC.
     Instant deletedAt; // sort delete
}
