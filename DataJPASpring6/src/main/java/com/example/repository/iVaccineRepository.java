package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ResultView;
import com.example.model.Vaccine;
import com.example.view.View;


public interface iVaccineRepository extends JpaRepository<Vaccine, Integer> {
	
	
	//                     findby-propertyName-keywords
	 public <T extends View>List<T>findByvaccineCostLessThan(Double cost, Class <T> cls);

}
