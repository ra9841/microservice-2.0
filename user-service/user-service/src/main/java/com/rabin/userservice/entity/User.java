package com.rabin.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "USER_TBL")
public class User {
    @Column(name="USER_ID",nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(name="FIRST_NAME",nullable = false)
    private String firstName;
    @Column(name="LAST_NAME",nullable = false)
    private String lastName;
    @Column(name="EMAIL_ID",nullable = false)
    private String email;

    private Long departmentId;
}
