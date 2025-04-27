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
import com.example.view.View;

@Service
public class VaccineService implements iVaccineService{
	
	@Autowired
	private iVaccineRepository iVaccineRepo;



	@Override
	public <T extends View> List<T> fetchbyvaccineCostLessThan(Double cost, Class<T> cls) {
		// TODO Auto-generated method stub
		return iVaccineRepo.findByvaccineCostLessThan(cost, cls);
	}

	
	

	
		

}

