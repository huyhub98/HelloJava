package com.ifi.transport.dao;

import com.ifi.transport.entity.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransportRepository extends JpaRepository <Transport, Integer> {
    @Query(value = "SELECT t FROM Transport t WHERE t.name like :name")
    List<Transport> search (@Param("name") String name);

    @Query(value = "SELECT t FROM Transport t")
    List<Transport> show ();
}
