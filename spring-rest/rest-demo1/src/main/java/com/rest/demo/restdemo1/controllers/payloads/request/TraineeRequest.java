package com.rest.demo.restdemo1.controllers.payloads.request;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TraineeRequest {

    @Digits(message = "ID must be number.", integer = 6, fraction = 0)
    @Length(min = 6, max = 6)
    private String id;

    @Email(message = "please provide a valid email.")
    private String email;

    @NotBlank(message = "Name cannot be blank.")
    private String name;

    @NotBlank(message = "Service line cannot be blank.")
    private String serviceLine;
    
}
