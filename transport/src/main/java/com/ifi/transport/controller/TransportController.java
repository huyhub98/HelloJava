package com.ifi.transport.controller;

import com.ifi.transport.repository.TransportRepository;
import com.ifi.transport.dao.impl.TransportDaoImpl;
import com.ifi.transport.entity.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TransportController {
    @Autowired
    private TransportRepository transportRepository;

    @Autowired
    private TransportDaoImpl transportDao;
    public static List<Transport> transportList = new ArrayList<Transport>();

    // create
    @GetMapping(value = "/create")
    public String create() {
        return "Create";
    }

    @PostMapping(value = "/create")
    public String create(@ModelAttribute Transport transport) {
        transportRepository.save(transport);
        return "redirect:/display";
    }

    // display
    @GetMapping(value = "/display")
    public String show(Model model, @RequestParam(value = "keyword", required = false) String keyword) {
        if (keyword == null) {
            keyword = "";
        }
        transportList = transportRepository.search("%" + keyword + "%");
        model.addAttribute("trans", transportList);
        model.addAttribute("keyword", keyword);
        return "Display";
    }

    // delete
    @GetMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") int id) {
        transportRepository.deleteById(id);
        return "redirect:/display";
    }

    // update
    @GetMapping(value = "/update")
    public String update(@RequestParam(value = "id") int id, Model model) {
        Transport trans = transportRepository.getOne(id);
        model.addAttribute("tran", trans);
        return "Update";
    }

    @PostMapping(value = "/update")
    public String update(@ModelAttribute (name = "transport")Transport transport) {
        transportRepository.saveAndFlush(transport);
        //transportDao.update(transport);
        return "redirect:/display";
    }
}
