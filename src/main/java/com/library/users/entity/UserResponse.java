package com.library.users.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
