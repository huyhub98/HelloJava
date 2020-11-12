package com.ifi.transport.dao;

import com.ifi.transport.entity.User;

import java.util.List;

public interface UserDao {
    void create(User user);

    void update(User user);

    void delete(int id);

    User getId(int id);

    List<User> search(String username);

    List<User> getList();
}
