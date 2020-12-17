package com.ifi.transport.controller;

import com.ifi.transport.entity.User;
import com.ifi.transport.model.UserDTO;
import com.ifi.transport.repository.UserRepository;
import com.ifi.transport.service.UserService;
import com.ifi.transport.utils.UserExportExcel;
import com.ifi.transport.utils.UserExportPDF;
import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
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
        userService.delete(id);
        return "deleted user with id: " + id;
    }

    //PDF
    @GetMapping("/users/export/pdf")
    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);

        List<User> listUsers = userService.list();

        UserExportPDF exporter = new UserExportPDF(listUsers);
        exporter.export(response);
    }

    //Excel
    @GetMapping("/users/export/excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);

        List<User> users = userService.list();

        UserExportExcel excelExporter = new UserExportExcel(users);

        excelExporter.export(response);
    }
}
