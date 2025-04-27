package com.example.service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.ResultView;
import com.example.model.Vaccine;
import com.example.repository.iVaccineRepository;

@Service
public class VaccineService implements iVaccineService{
	
	@Autowired
	private iVaccineRepository iVaccineRepo;

	@Override
	public List<Vaccine> FetchVaccinesbyCost(double cost) {
		// TODO Auto-generated method stub
		return iVaccineRepo.findByvaccineCostLessThan(cost);
	}

	@Override
	public List<Vaccine> fetchVaccineslessthanthegivencost(double cost) {
		// TODO Auto-generated method stub
		return iVaccineRepo.findByvaccineCostLessThan(cost);
	}

	@Override
	public List<Vaccine> fetchVaccinesBetweengivencosts(double mincost, double maxcost) {
		// TODO Auto-generated method stub
		return iVaccineRepo.findByvaccineCostBetween(mincost, maxcost);
	}

	@Override
	public List<Vaccine> fetchVaccineWithCompanyName(String company) {
		// TODO Auto-generated method stub
		return iVaccineRepo.findByvaccineCompanyEquals(company);
	}

	@Override
	public List<Vaccine> fetchVaccineWithingivenCompanyNames(Collection<String> vaccinecompany) {
		// TODO Auto-generated method stub
		return iVaccineRepo.findByvaccineCompanyIn(vaccinecompany);
	}

	@Override
	public List<Vaccine> fetchVaccineWithingivenCompanyNamesandCostsRange(Collection<String> vaccinecompany,
			double mincost, double maxcost) {
		// TODO Auto-generated method stub
		return iVaccineRepo.findByVaccineCompanyInAndVaccineCostBetween(vaccinecompany, mincost, maxcost);
	}



	

	
		

}

