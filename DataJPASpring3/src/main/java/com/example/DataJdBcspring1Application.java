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
		
           vs.featchingDetailes(true, "vaccineName","vaccineCost").forEach(l->System.out.println(l));
           
           vs.FetchVaccineByPagination( 0, 4, true, "vaccineCost").forEach(l->System.out.println(l.getVaccineCost()));
	
           vs.FetchVaccinebyPages(2);
	}

}
