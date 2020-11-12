package com.ifi.transport.controller;

import com.ifi.transport.model.UserDTO;
import com.ifi.transport.repository.UserRepository;
import com.ifi.transport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;


    @GetMapping("/list")
    public List<UserDTO> getList(){
        return userService.getAll();
    }
}
