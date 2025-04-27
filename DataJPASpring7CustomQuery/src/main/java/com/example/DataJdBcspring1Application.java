package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.iVaccineService;

@SpringBootApplication
public class DataJdBcspring1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DataJdBcspring1Application.class, args);
		iVaccineService vs = container.getBean(iVaccineService.class);

		// vs.searchbyVaccineCompany("Australia").forEach(l->System.out.println(l));

		// vs.searchbyVaccineCostsinRange(4000, 4500).forEach(l->System.out.println(l));

		// vs.searchVCbyVaccineCostsinRange(4000,
		// 4500).forEach(l->System.out.println(l));

		// List<String>companynames=List.of("Asia","INDIA","Sing");
		// vs.searchByVaccineNamess(companynames).forEach(l->System.out.println(l));

		// System.out.println(vs.updateVaccineCostBYVaccineName(4200, "CoINDIA"));

		//System.out.println(vs.deleteVaccineByVaccineName("CoINDIA"));
		
		System.out.println(vs.insertvaccine(12, "Canada", 5000, "CAvaccine"));
	}

}
