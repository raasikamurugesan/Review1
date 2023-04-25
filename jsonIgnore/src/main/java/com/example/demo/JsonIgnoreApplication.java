package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsonIgnoreApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(JsonIgnoreApplication.class, args);
		Person ob=new Person(1,"Raasika","18");
		ObjectMapper o=new ObjectMapper();
		String json=o.writeValueAsString(ob);
		System.out.println(json);
		
	}

}
