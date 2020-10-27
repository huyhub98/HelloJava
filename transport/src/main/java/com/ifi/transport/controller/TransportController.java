package com.ifi.transport.controller;

import com.ifi.transport.dao.TransportRepository;
import com.ifi.transport.entity.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TransportController {
    @Autowired
    private TransportRepository transportRepository;
    public static List<Transport> transportList = new ArrayList<Transport>();

    //    @GetMapping(value = "/display")
//    public String show(HttpSession session, @RequestParam(value = "name", required = false) String name) {
//        if (name == null) {
//            name = "";
//        }
//        transportList = transportRepository.search("%" + name + "%");
//        session.setAttribute("trans", transportList);
//        return "/display";
//    }
    @GetMapping(value = "/display")
    public String show(HttpSession session) {
        transportList = transportRepository.show();
        session.setAttribute("trans", transportList);
        return "display";
    }

    @PostMapping(value = "/display")
    public String display() {
        return "redirect:/display";
    }
}
