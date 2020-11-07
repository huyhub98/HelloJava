package com.ifi.transport.controller;

import com.ifi.transport.dao.TransportRepository;
import com.ifi.transport.entity.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransportRestController {
    @Autowired
    private TransportRepository transportRepository;

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
}
