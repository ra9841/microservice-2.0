package com.rabin.departmentservice.service;

import com.rabin.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto registeringTheDepartmentInforamtion(DepartmentDto departmentDto);

    DepartmentDto getDepartmentRecordById(Long departmentId);
}
