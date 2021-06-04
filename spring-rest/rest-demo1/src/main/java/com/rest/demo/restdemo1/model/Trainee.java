package com.rest.demo.restdemo1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "trainees")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trainee {

    @Id
    private Long id;

    private String email;

    private String name;

    private String serviceLine;

}
