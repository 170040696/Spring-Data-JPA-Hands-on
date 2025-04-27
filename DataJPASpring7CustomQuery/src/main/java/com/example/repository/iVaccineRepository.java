package com.example.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Vaccine;

@Repository
public interface iVaccineRepository extends JpaRepository<Vaccine, Integer> {

	@Query("from Vaccine where vaccineCompany=:company")
	public List<Vaccine> searchByVaccinecompany(@Param("company") String vaccineompany);

	@Query("select distinct v from Vaccine v where vaccineCost between :mincost and :maxcost")
	public List<Vaccine> searchByVaccineCost(double mincost, double maxcost);

	@Query("select distinct vaccineName,vaccineCompany from Vaccine v where vaccineCost between :mincost and :maxcost")
	public List<String> searchVCByVaccineCost(double mincost, double maxcost);

	@Query("from Vaccine where vaccineCompany IN :Vaccinecompanys")
	public List<Vaccine> searchBylistofVaccineCompany(List<String> Vaccinecompanys);

	@Transactional
	@Modifying
	@Query("update Vaccine set vaccineCost=:VaccineCost where vaccineName=:VaccineName")
	public int updateVaccineCostByVaccineName(double VaccineCost, String VaccineName);

	@Transactional
	@Modifying
	@Query("delete from Vaccine where vaccineName=:VaccineName")
	public int deleteVaccineByVaccineName(String VaccineName);
	
	@Transactional
	@Modifying
	@Query(value="Insert into Vaccine(`id`,`vaccine_company`,`vaccine_cost`,`vaccine_name`)Values(?,?,?,?)",nativeQuery=true)
	public int inserthevaccineinfo(Integer id, String Vaccinecompany, double VaccineCost, String vaccineName);

}
