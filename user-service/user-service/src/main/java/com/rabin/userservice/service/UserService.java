package com.rabin.userservice.service;

import com.rabin.userservice.dto.ResponseTemplateDto;
import com.rabin.userservice.dto.UserDto;

public interface UserService {
    UserDto registeringTheRecord(UserDto userDto);

    ResponseTemplateDto getUserWithDepartment(Long userId);
}
