package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "vaccine_name")
	private String vaccineName;

	@Column(name = "vaccine_company")
	private String vaccineCompany;

	@Column(name = "vaccine_cost")
	private double vaccineCost;

	public Vaccine(Integer id, String vaccineName, String vaccineCompany, double vaccineCost) {
		super();
		this.id = id;
		this.vaccineName = vaccineName;
		this.vaccineCompany = vaccineCompany;
		this.vaccineCost = vaccineCost;
	}

	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", vaccineName=" + vaccineName + ", vaccineCompany=" + vaccineCompany
				+ ", vaccineCost=" + vaccineCost + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getVaccineCompany() {
		return vaccineCompany;
	}

	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}

	public double getVaccineCost() {
		return vaccineCost;
	}

	public void setVaccineCost(double vaccineCost) {
		this.vaccineCost = vaccineCost;
	}

}
