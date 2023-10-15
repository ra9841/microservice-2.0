package com.rabin.departmentservice.controller;

import com.rabin.departmentservice.dto.DepartmentDto;
import com.rabin.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public DepartmentDto savingRecord(@RequestBody DepartmentDto departmentDto) {
        log.info("data passing to service {}", departmentDto);
        return departmentService.registeringTheDepartmentInforamtion(departmentDto);
    }

    @GetMapping("/{id}")
    public DepartmentDto getRecordById(@PathVariable("id") Long departmentId) {
        log.info("id passing to service {}", departmentId);
        return departmentService.getDepartmentRecordById(departmentId);

    }
}
