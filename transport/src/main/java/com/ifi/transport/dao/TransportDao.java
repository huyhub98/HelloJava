package com.ifi.transport.dao;

import com.ifi.transport.entity.Transport;

import java.util.List;

public interface TransportDao {
    void create(Transport trans);

    void update(Transport trans);

    void delete(int id);
}
