package com.example.service;

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
public class VaccineService implements iVaccineService{
	
	@Autowired
	private iVaccineRepository iVaccineRepo;

	@Override
	public Vaccine SearchVaccinebyId(int id) {
		// TODO Auto-generated method stub
		return iVaccineRepo.getReferenceById(id);
	}

	@Override
	public List<Vaccine> SearchVaccinesbyIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return iVaccineRepo.findAllById(ids);
	}

	@Override
	public List<Vaccine> SearchByVaccine(Vaccine vaccine) {
		// TODO Auto-generated method stub
		Example<Vaccine> example=Example.of(vaccine);
		return iVaccineRepo.findAll(example);
		
	}

	@Override
	public String DeleteVaccinebyIds(List<Integer> ids) {
		
		// TODO Auto-generated method stub
		List<Vaccine> v=iVaccineRepo.findAllById(ids);
		if(v.size()!=0) {
		iVaccineRepo.deleteAllById(ids);
		return "Vaccines deleted successfully";
		}
		else {
			return "No Vaccines present with the give ID";
		}
		
		
	}

	
		

}

