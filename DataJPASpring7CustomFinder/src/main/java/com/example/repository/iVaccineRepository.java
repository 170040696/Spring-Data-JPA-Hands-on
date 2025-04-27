package com.example.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ResultView;
import com.example.model.Vaccine;

@Repository
public interface iVaccineRepository extends JpaRepository<Vaccine, Integer> {
	
	public List<Vaccine> findByvaccineCostEquals(double cost);

	public List<Vaccine> findByvaccineCostLessThan(double cost);
	
	public List<Vaccine> findByvaccineCostBetween(double mincost, double maxcost);
	
	public List<Vaccine> findByvaccineCompanyEquals(String company);
	
	public List<Vaccine> findByvaccineCompanyIn(Collection<String> vaccinecompany);
	
	public List<Vaccine> findByVaccineCompanyInAndVaccineCostBetween(Collection<String> vaccinecompany, double mincost, double maxcost);
	
	

}
