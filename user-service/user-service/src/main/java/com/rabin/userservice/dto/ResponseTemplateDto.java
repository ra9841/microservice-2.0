package com.rabin.userservice.dto;

import com.rabin.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseTemplateDto {
    private User user;
    private DepartmentDto departmentDto;
}
