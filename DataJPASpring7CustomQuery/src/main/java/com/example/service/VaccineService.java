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

import com.example.model.Vaccine;
import com.example.repository.iVaccineRepository;

@Service
public class VaccineService implements iVaccineService {

	@Autowired
	iVaccineRepository repo;

	@Override
	public List<Vaccine> searchbyVaccineCompany(String VaccineCompany) {
		// TODO Auto-generated method stub
		return repo.searchByVaccinecompany(VaccineCompany);
	}

	@Override
	public List<Vaccine> searchbyVaccineCostsinRange(double mincost, double maxcost) {
		// TODO Auto-generated method stub
		return repo.searchByVaccineCost(mincost, maxcost);
	}

	@Override
	public List<String> searchVCbyVaccineCostsinRange(double mincost, double maxcost) {
		// TODO Auto-generated method stub
		return repo.searchVCByVaccineCost(mincost, maxcost);
	}

	@Override
	public List<Vaccine> searchByVaccineNamess(List<String> Vaccinecompanys) {
		// TODO Auto-generated method stub
		return repo.searchBylistofVaccineCompany(Vaccinecompanys);
	}

	@Override
	public int updateVaccineCostBYVaccineName(double VaccineCost, String VaccineName) {
		// TODO Auto-generated method stub
		return repo.updateVaccineCostByVaccineName(VaccineCost, VaccineName);
	}

	@Override
	public int deleteVaccineByVaccineName(String VaccineName) {
		// TODO Auto-generated method stub
		return repo.deleteVaccineByVaccineName(VaccineName);
	}

	@Override
	public int insertvaccine(Integer id, String Vaccinecompany, double VaccineCost, String vaccineName) {
		// TODO Auto-generated method stub
		return repo.inserthevaccineinfo(id, Vaccinecompany, VaccineCost, vaccineName);
	}

}
