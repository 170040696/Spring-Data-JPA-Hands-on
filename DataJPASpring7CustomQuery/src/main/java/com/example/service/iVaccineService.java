package com.example.service;

import java.util.Collection;
import java.util.List;

import com.example.model.Vaccine;

public interface iVaccineService {

	public List<Vaccine> searchbyVaccineCompany(String VaccineCompany);

	public List<Vaccine> searchbyVaccineCostsinRange(double mincost, double maxcost);

	public List<String> searchVCbyVaccineCostsinRange(double mincost, double maxcost);

	public List<Vaccine> searchByVaccineNamess(List<String> Vaccinecompanys);

	public int updateVaccineCostBYVaccineName(double VaccineCost, String VaccineName);

	public int deleteVaccineByVaccineName(String VaccineName);
	
	public int insertvaccine(Integer id, String Vaccinecompany, double VaccineCost, String vaccineName);
	
	

}
