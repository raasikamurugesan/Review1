package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.model.Model;


@Repository
public interface chacoRepository extends JpaRepository<Model, Integer> {

	
}
