package com.example.service;



import java.util.List;

import com.example.model.Vaccine;

public interface iVaccineService {
	public Vaccine SearchVaccinebyId(int id);
	public List<Vaccine> SearchVaccinesbyIds(List<Integer>ids);
	public List<Vaccine> SearchByVaccine(Vaccine vaccine);
	public String DeleteVaccinebyIds(List<Integer>ids);
}
