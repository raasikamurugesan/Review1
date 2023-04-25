package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.qos.logback.core.model.Model;

public interface Repository extends JpaRepository<Model, Integer> {

}
