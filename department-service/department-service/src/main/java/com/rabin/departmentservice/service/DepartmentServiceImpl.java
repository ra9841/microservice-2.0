package com.rabin.departmentservice.service;

import com.rabin.departmentservice.dto.DepartmentDto;
import com.rabin.departmentservice.entity.Department;
import com.rabin.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto registeringTheDepartmentInforamtion(DepartmentDto departmentDto) {
        Department department = new Department();
        BeanUtils.copyProperties(departmentDto, department);
        log.info("data save in database {}", department);
        Department department1=departmentRepository.save(department);
        DepartmentDto departmentDto1 = new DepartmentDto();
        BeanUtils.copyProperties(department1, departmentDto1);
        log.info("data from database and passing to controller {}", departmentDto);
        return departmentDto1;
    }

    @Override
    public DepartmentDto getDepartmentRecordById(Long departmentId) {
        Optional<Department> recordExist = departmentRepository.findById(departmentId);
        if (recordExist.isPresent()) {
            log.info("id is present in database {}", departmentId);
            Department department = recordExist.get();
            DepartmentDto departmentDto = new DepartmentDto();
            BeanUtils.copyProperties(department, departmentDto);
            log.info("data is passing to controller from database by id {}", departmentDto);
            return departmentDto;
        } else {
            throw new RuntimeException("file not present");
        }
    }
}
