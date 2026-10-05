package com.jsp.lovable_clone.entity;

import com.jsp.lovable_clone.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    //only one subscription allow to the user
     Long id;
     Long user;
     Long plan;

     SubscriptionStatus status;

     String stripeCustomerId;
     String stripeSubscriptionId;

     Instant currentPeriodStart;
     Instant currentPeriodEnd;
     Boolean cancelAtPeriodEnd;

     Instant createdAt;
     Instant updateAt;

}
