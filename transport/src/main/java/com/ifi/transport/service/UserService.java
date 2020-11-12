package com.ifi.transport.service;

import com.ifi.transport.model.UserDTO;

import java.util.List;

public interface UserService {
    void create(UserDTO userDTO);

    void update(UserDTO userDTO);

    void delete(int id);

    UserDTO getUser(int id);

    List<UserDTO> getAll();
}
