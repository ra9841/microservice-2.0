package com.rabin.departmentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartmentDto {
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
