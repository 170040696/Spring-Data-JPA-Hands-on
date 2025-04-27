package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ResultView;
import com.example.model.Vaccine;


public interface iVaccineRepository extends JpaRepository<Vaccine, Integer> {
	
	
	//                     findby-propertyName-keywords
	public List<ResultView>findByvaccineCostLessThan(Double cost);

}
