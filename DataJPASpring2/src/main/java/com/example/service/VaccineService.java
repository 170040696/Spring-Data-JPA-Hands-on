package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Vaccine;
import com.example.repository.iVaccineRepository;

@Service
public class VaccineService implements iVaccineService{
	
	@Autowired
	private iVaccineRepository iVaccineRepo;

	@Override
	public String RegisterVaccine(Vaccine vaccine) {
		// TODO Auto-generated method stub
		Vaccine vac=iVaccineRepo.save(vaccine);
		return "Vaccine Registered with id : "+ vac.getId();
	}

	@Override
	public List<Vaccine> RegisterMultipleVaccine(List<Vaccine> vaccines) {
		// TODO Auto-generated method stub
		
		return (List<Vaccine>) iVaccineRepo.saveAll(vaccines);
		
	}

	@Override
	public long getCount() {
		// TODO Auto-generated method stub
		return iVaccineRepo.count();
	}

	@Override
	public Boolean CheckAvailability(int id) {
		// TODO Auto-generated method stub
		//Optional<Vaccine> vc= iVaccineRepo.findById(id);
		return iVaccineRepo.existsById(id);
		//return vc.isPresent();
	}

	@Override
	public Iterable<Vaccine> FetchAllVaccines() {
		// TODO Auto-generated method stub
		
		return iVaccineRepo.findAll();
	}

	@Override
	public String DeleteVaccine(int id) {
		// TODO Auto-generated method stub
		Optional<Vaccine> vc=iVaccineRepo.findById(id);
		if(vc.isPresent())
		{
			iVaccineRepo.deleteById(id);
			return "Vaccine Deleted Successfully of id :"+id;
		}
		else
		return "No Vaccine is available in DB with give id :"+ id;
	}

	@Override
	public String UpdateVaccine(int id, double vaccine_cost) {
		// TODO Auto-generated method stub
		
//		Optional<Vaccine> vc= iVaccineRepo.findById(id);
//		if(vc.isPresent()) {
//			Vaccine vaccine=vc.get();
//			vaccine.setVaccine_cost(vaccine_cost);
//			iVaccineRepo.save(vaccine);
//			return "VaccineCost is updated successfully of id: "+id;
//		}
//		else
//		return "VaccineCost is not updated";
		
		//Or With Lambda expression
		
		return iVaccineRepo.findById(id).map(vc->{
			vc.setVaccine_cost(vaccine_cost);
			iVaccineRepo.save(vc);
		return"VaccineCost Updated successfully for id:"+ id;
		}).orElse( "Vaccine not found with given id :"+ id);
		
		 
	}

}

