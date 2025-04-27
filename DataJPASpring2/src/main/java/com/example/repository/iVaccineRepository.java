package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.model.Vaccine;


public interface iVaccineRepository extends CrudRepository<Vaccine, Integer> {

}
