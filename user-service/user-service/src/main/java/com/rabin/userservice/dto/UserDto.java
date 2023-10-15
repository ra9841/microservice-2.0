package com.rabin.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;
}
