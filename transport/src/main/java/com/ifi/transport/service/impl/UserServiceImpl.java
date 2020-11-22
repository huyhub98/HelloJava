package com.ifi.transport.service.impl;

import com.ifi.transport.dao.UserDao;
import com.ifi.transport.entity.User;
import com.ifi.transport.model.UserDTO;
import com.ifi.transport.repository.UserRepository;
import com.ifi.transport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDao userDao;

    @Override
    public void create(UserDTO userDTO) {
        User user = new User();
        user.setFullName(userDTO.getFullName());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setRole(userDTO.getRole());
        userRepository.save(user);
    }

    @Override
    public void update(UserDTO userDTO) {
        User user = userDao.getId(userDTO.getId());
        if (user != null) {
            user.setFullName(userDTO.getFullName());
            user.setUsername(userDTO.getUsername());
            user.setPassword(userDTO.getPassword());
            user.setEmail(userDTO.getEmail());
            user.setPhoneNumber(userDTO.getPhoneNumber());
            user.setRole(userDTO.getRole());
            userDao.create(user);
        }
    }

    @Override
    public void delete(int id) {
        User user = userDao.getId(id);
        if (user != null) {
            userDao.delete(user);
        }
    }

    @Override
    public UserDTO getUser(int id) {
        User user = userDao.getId(id);
        return convertUser(user);
    }

    @Override
    public List<UserDTO> getAll() {
        List<User> users = userDao.getList();
        List<UserDTO> userDTOS = new ArrayList<UserDTO>();
        for (User user : users) {
            userDTOS.add(convertUser(user));
        }
        return userDTOS;
    }

    @Override
    public List<User> list() {
        return userRepository.findAll(Sort.by("email").descending());
    }

    private UserDTO convertUser(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFullName(user.getFullName());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setEmail(user.getEmail());
        userDTO.setRole(user.getRole());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        return userDTO;
    }
}
