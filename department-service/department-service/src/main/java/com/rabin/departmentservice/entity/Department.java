package com.rabin.departmentservice.entity;

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
@Table(name="DEPARTMENT_TBL")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @Column(name="DEPARTMENT_NAME",nullable = false)
    private String departmentName;
    @Column(name="DEPARTMENT_ADDRESS",nullable = false)
    private String departmentAddress;
    @Column(name="DEPARTMENT_CODE",nullable = false)
    private String departmentCode;
}
