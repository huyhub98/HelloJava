package com.ifi.transport.controller;

import com.ifi.transport.dao.TransportRepository;
import com.ifi.transport.dao.impl.TransportDaoImpl;
import com.ifi.transport.entity.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TransportController {
    @Autowired
    private TransportRepository transportRepository;
    @Autowired
    private TransportDaoImpl transportDao;
    public static List<Transport> transportList = new ArrayList<Transport>();

    @GetMapping(value = "/display")
    public String show(Model model, @RequestParam(value = "keyword", required = false) String keyword) {
        if (keyword == null) {
            keyword = "";
        }
        transportList = transportRepository.search("%" + keyword + "%");
        model.addAttribute("trans", transportList);
        model.addAttribute("keyword", keyword);
        return "display";
    }

//    @GetMapping(value = "/display")
//    public String show(Model model,HttpServletRequest req) {
//        //transportList = transportDao.getList();
//        transportList = transportRepository.show();
//        //model.addAttribute("trans", transportList);
//        req.setAttribute("trans",transportList);
//        return "display";
//    }

    @GetMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") int id) {
        transportRepository.deleteById(id);
        return "redirect:/display";
    }

    @GetMapping(value = "/update")
    public String update(@RequestParam(value = "id") int id, HttpServletRequest req) {
        Transport trans = transportRepository.getOne(id);
        req.setAttribute("trans", trans);
        return "update";
    }
}
