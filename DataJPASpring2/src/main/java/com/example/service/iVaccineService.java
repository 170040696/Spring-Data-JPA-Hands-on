package com.example.service;


import java.util.List;

import com.example.model.Vaccine;


public interface iVaccineService {

	public  String RegisterVaccine(Vaccine vaccine); 
	
	public List<Vaccine> RegisterMultipleVaccine(List<Vaccine> vaccines);
	
	public long getCount();
	
	public Boolean CheckAvailability(int id);
	
	public Iterable<Vaccine> FetchAllVaccines();
	
	public String DeleteVaccine(int id);
	
	public String UpdateVaccine(int id, double vaccine_cost);
}
