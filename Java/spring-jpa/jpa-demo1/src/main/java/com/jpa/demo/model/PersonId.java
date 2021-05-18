package com.jpa.demo.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonId {

    private String mobileNumber;

    private LocalDateTime requestTime;
    
}
