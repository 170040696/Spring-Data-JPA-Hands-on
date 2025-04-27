package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.Vaccine;
import com.example.repository.iVaccineRepository;
import com.example.service.iVaccineService;
import com.example.view.ResultView1;
import com.example.view.ResultView2;

@SpringBootApplication
public class DataJdBcspring1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(DataJdBcspring1Application.class, args);
		iVaccineService vs=container.getBean(iVaccineService.class);
		vs.fetchbyvaccineCostLessThan(4500.0, ResultView2.class).forEach(l->System.out.println(l.getVaccineCompany()+" "+l.getVaccineName()
		+" "+l.getVaccineCost() ));
	}

}
