package com.ifi.transport.controller;

import com.ifi.transport.model.UserDTO;
import com.ifi.transport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/create")
    public String createUser() {
        return "Add-user";
    }

    @PostMapping("/user/create")
    public String createUser(@ModelAttribute UserDTO userDTO) {
        userService.create(userDTO);
        return "redirect:/user/create";
    }
}
