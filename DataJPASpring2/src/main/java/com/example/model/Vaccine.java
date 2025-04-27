package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String vaccine_name;
	private String vaccine_company;
	private double vaccine_cost;
	public Vaccine(String vaccine_name, String vaccine_company, double vaccine_cost) {
		super();
		this.vaccine_name = vaccine_name;
		this.vaccine_company = vaccine_company;
		this.vaccine_cost = vaccine_cost;
	}
	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", vaccine_name=" + vaccine_name + ", vaccine_company=" + vaccine_company
				+ ", vaccine_cost=" + vaccine_cost + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVaccine_name() {
		return vaccine_name;
	}
	public void setVaccine_name(String vaccine_name) {
		this.vaccine_name = vaccine_name;
	}
	public String getVaccine_company() {
		return vaccine_company;
	}
	public void setVaccine_company(String vaccine_company) {
		this.vaccine_company = vaccine_company;
	}
	public double getVaccine_cost() {
		return vaccine_cost;
	}
	public void setVaccine_cost(double vaccine_cost) {
		this.vaccine_cost = vaccine_cost;
	}
	
	
}
