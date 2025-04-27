package com.example.service;



import java.util.List;

import com.example.model.Vaccine;


public interface iVaccineService {

	public Iterable<Vaccine> featchingDetailes(Boolean status, String...properties);
	
	public List<Vaccine> FetchVaccineByPagination(int pageNumber, int PageSize,Boolean status, String...properties);
	
	public void FetchVaccinebyPages(int pagesize);
}
