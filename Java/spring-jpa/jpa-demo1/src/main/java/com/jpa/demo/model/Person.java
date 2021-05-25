package com.jpa.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(PersonId.class)
public class Person {
    
    @Id
    private String mobileNumber;

    @Id
    private LocalDateTime requestTime;

    private String name;

    private String email;


    // person.mobileNumber = ? and person.requestTime = ?
}
