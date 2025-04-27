package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.Vaccine;
import com.example.repository.iVaccineRepository;
import com.example.service.iVaccineService;

@SpringBootApplication
public class DataJdBcspring1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(DataJdBcspring1Application.class, args);
		iVaccineService vs=container.getBean(iVaccineService.class);
		
          // System.out.println(vs.SearchVaccinebyId(4));
		
//		ArrayList<Integer>ids=new ArrayList<>(List.of(2,4,6,3));
//		vs.SearchVaccinesbyIds(ids).forEach(l->System.out.println(l));
		
		//vs.SearchByVaccine(vs.SearchVaccinebyId(4)).forEach(l->System.out.println(l));
		
		ArrayList<Integer>ids=new ArrayList<>(List.of(3,2));
		System.out.println(vs.DeleteVaccinebyIds(ids));
	}

}
