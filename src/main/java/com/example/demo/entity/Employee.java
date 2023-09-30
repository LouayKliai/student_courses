package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
@Id
private int id;
private int identifier;
private String FirstName,LastName;
private String email;
private Date birthday;
private Role role;


@OneToOne
private Address add;

@ManyToOne
private Departement dept;

@ManyToMany
private List<Mission> missions;



}
