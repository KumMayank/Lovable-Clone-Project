package com.jsp.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.Instant;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {

     Long id;
     String name;
     User owner;

     boolean isPublic=false;

     Instant createdAt;
     Instant updatedAt;
     Instant deletedAt;
}
