package com.example;

import java.util.ArrayList;

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
		
//		Vaccine vc1=new Vaccine("CoUSA","USA",4080.6);
//		System.out.println(vs.RegisterVaccine(vc1));
		
//		ArrayList<Vaccine> al= new ArrayList<>();
//		al.add(new Vaccine("CovAustralia","Australia",4080.6));
//		al.add(new Vaccine("CoviSinga","Sing",4009.6));
//		al.add(new Vaccine("CoPune","Pune",4660.6));
//		vs.RegisterMultipleVaccine(al).forEach(l->System.out.println(l));
//		
//		System.out.println("Number of vaccines present in the DB are : "+vs.getCount());
//		
//		System.out.println("Vaccine Availability :"+ vs.CheckAvailability(4));
//		
//		vs.FetchAllVaccines().forEach(l->System.out.println(l));
		
		//System.out.println(vs.DeleteVaccine(13));
		
		System.out.println(vs.UpdateVaccine(7, 4100));
		
	}

}
