package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Vaccine;


public interface iVaccineRepository extends JpaRepository<Vaccine, Integer> {

}
