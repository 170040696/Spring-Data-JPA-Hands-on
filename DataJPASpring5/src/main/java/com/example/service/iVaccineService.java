package com.example.service;



import java.util.List;

import com.example.ResultView;
import com.example.model.Vaccine;

public interface iVaccineService {
	public List<ResultView>fetchbyvaccineCostLessThan(Double cost);
}
