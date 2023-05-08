package com.example.demo.chocolateRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.chocolateModel.chocoLoginModel;

public interface LoginRepo extends JpaRepository<chocoLoginModel, Integer>
{
  chocoLoginModel findByusername(String username);
}
