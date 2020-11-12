package com.ifi.transport.controller;

import com.ifi.transport.entity.User;
import com.ifi.transport.repository.TransportRepository;
import com.ifi.transport.entity.Transport;
import com.ifi.transport.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransportRestController {
    @Autowired
    private TransportRepository transportRepository;

    @Autowired
    private UserRepository userRepository;

    // get all
    @GetMapping("/show")
    public List<Transport> getList() {
        return transportRepository.findAll();
    }

    // create
    @PostMapping("/new")
    public Transport create(@RequestBody Transport transport) {
        transportRepository.save(transport);
        return transport;
    }

    // update
    @PutMapping("/updated/{id}")
    public Transport update(@RequestBody Transport transport) {
        transportRepository.save(transport);
        return transport;
    }

    // delete
    @DeleteMapping("/deleted/{id}")
    public String delete(@PathVariable("id") int id) {
        transportRepository.deleteById(id);
        return "deleted object id: " + id;
    }

    //check login
    @PostMapping("/api/login")
    @ResponseStatus(code = HttpStatus.CREATED)
    public User checkLogin(@RequestBody User user) {
        user = userRepository.check(user.getUsername(), user.getPhoneNumber(), user.getPassword());
        return user;

    }
}
