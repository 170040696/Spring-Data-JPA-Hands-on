package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
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
		//vs.FetchVaccinesbyCost(4660.6).forEach(l->System.out.println(l));
		
		//vs.fetchVaccineslessthanthegivencost(4660.6).forEach(l->System.out.println(l));
		
		//vs.fetchVaccinesBetweengivencosts(4000, 4500).forEach(l->System.out.println(l));
		
		//vs.fetchVaccineWithCompanyName("Australia").forEach(l->System.out.println(l));  "Australia","Pune","Sing"
		
		Collection<String> v=new HashSet<>();
		v.add("Australia");
		v.add("Pune");
		v.add("Sing");
				
	//	vs.fetchVaccineWithingivenCompanyNames(v).forEach(l->System.out.println(l));
		
		vs.fetchVaccineWithingivenCompanyNamesandCostsRange(v, 4000, 4500).forEach(l->System.out.println(l));
	}

}
