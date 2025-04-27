package com.example.service;

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
	public List<ResultView> fetchbyvaccineCostLessThan(Double cost) {
		// TODO Auto-generated method stub
		System.out.println("in VaccineService and cost is:"+ cost);
		return iVaccineRepo.findByvaccineCostLessThan(cost);
	}

	
	

	
		

}

