package com.library.users.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.extern.slf4j.Slf4j;

@Entity
@Slf4j
@Table(name = "USER_TABLE")
public class UserEntity {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

}
