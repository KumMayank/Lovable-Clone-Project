package com.jsp.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    Long id;

    String name;
    String stripePriceId;

    Integer maxProjects;
    Integer maxTokensPerDay;
    Integer maxPreviews; // max number of previous allowed per plan

    Boolean unlimitedAi; // Unlimited access to LLM, ignore maxTokenPerDay if true

    Boolean active;

}
