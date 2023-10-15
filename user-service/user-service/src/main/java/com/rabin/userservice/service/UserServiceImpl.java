package com.rabin.userservice.service;

import com.rabin.userservice.dto.DepartmentDto;
import com.rabin.userservice.dto.ResponseTemplateDto;
import com.rabin.userservice.dto.UserDto;
import com.rabin.userservice.entity.User;
import com.rabin.userservice.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public UserDto registeringTheRecord(UserDto userDto) {
        User user=new User();
        BeanUtils.copyProperties(userDto,user);
        User user1=userRepository.save(user);
        UserDto userDto1=new UserDto();
        BeanUtils.copyProperties(user1,userDto1);
        return userDto1;
    }

    @Override
    public ResponseTemplateDto getUserWithDepartment(Long userId) {
        ResponseTemplateDto responseTemplateDto=new ResponseTemplateDto();
        Optional<User> existUser=userRepository.findById(userId);
        if(existUser.isPresent()){
           User user= existUser.get();
//http://DEPARTMENT-SERVICE/departments----we r calling all api of this microservice(after eurka or ).we also can do localhost:9001/departments/ but if there are alot of api then it will be difficult
          DepartmentDto departmentDto= restTemplate.getForObject("http://localhost:9001/departments/" + user.getDepartmentId(), DepartmentDto.class);
          responseTemplateDto.setUser(user);
          responseTemplateDto.setDepartmentDto(departmentDto);
          return responseTemplateDto;
        }else{
            throw new RuntimeException();
        }

    }
}
