package com.ifi.transport.controller;

import com.ifi.transport.model.UserDTO;
import com.ifi.transport.repository.UserRepository;
import com.ifi.transport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/list")
    public List<UserDTO> getList() {
        return userService.getAll();
    }

    @PostMapping("/new-user")
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        userService.create(userDTO);
        return userDTO;
    }

    @PutMapping("/update-user/{id}")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        userService.update(userDTO);
        return userDTO;
    }

    @DeleteMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable int id) {
        //userRepository.deleteById(id);
        userService.delete(id);
        return "deleted user with id: " + id;
    }
}
