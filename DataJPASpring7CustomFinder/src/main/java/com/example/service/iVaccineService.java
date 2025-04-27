package com.example.service;



import java.util.Collection;
import java.util.List;

import com.example.ResultView;
import com.example.model.Vaccine;

public interface iVaccineService {
	
	public List<Vaccine> FetchVaccinesbyCost(double cost);
	
	public List<Vaccine> fetchVaccineslessthanthegivencost(double cost);
	
	public List<Vaccine> fetchVaccinesBetweengivencosts(double mincost, double maxcost);
	
	public List<Vaccine> fetchVaccineWithCompanyName(String company);
	
	public List<Vaccine> fetchVaccineWithingivenCompanyNames(Collection<String> vaccinecompany);
	
	public List<Vaccine> fetchVaccineWithingivenCompanyNamesandCostsRange(Collection<String> vaccinecompany, double mincost, double maxcost);
}
