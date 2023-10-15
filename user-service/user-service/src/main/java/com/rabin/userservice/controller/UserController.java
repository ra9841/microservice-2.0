package com.rabin.userservice.controller;

import com.rabin.userservice.dto.ResponseTemplateDto;
import com.rabin.userservice.dto.UserDto;
import com.rabin.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserDto savingUserInforamtion(@RequestBody UserDto userDto){
       return userService.registeringTheRecord(userDto);

    }

    @GetMapping("/{id}")
    public ResponseTemplateDto getUserWithDepartment(@PathVariable("id") Long userId){
     return   userService.getUserWithDepartment(userId);

    }
}
