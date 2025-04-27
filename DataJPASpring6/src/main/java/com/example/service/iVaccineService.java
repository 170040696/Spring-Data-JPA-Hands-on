package com.example.service;



import java.util.List;

import com.example.ResultView;
import com.example.model.Vaccine;
import com.example.view.View;

public interface iVaccineService {
	public <T extends View>List<T>fetchbyvaccineCostLessThan(Double cost, Class <T> cls);
}
