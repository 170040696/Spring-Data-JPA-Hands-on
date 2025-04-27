package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.Teacher;
import com.example.repository.iStudentRepository;

@SpringBootApplication
public class DataJdBcspring1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(DataJdBcspring1Application.class, args);
	   iStudentRepository sr= container.getBean(iStudentRepository.class);
	   System.out.println(sr.getClass().getName());
	   
	   sr.save(new Teacher(1,"nihalya","Ongole"));
	   sr.findAll().forEach(l->System.out.println(l));
	}

}
