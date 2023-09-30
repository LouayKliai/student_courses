package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Departement {
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy="dept")
	private List<Employee> employeeList;
	

}
