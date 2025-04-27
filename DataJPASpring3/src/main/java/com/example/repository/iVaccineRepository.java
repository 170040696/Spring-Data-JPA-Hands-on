package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.Vaccine;


public interface iVaccineRepository extends PagingAndSortingRepository<Vaccine, Integer> {

}
