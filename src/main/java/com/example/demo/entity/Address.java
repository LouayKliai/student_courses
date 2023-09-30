package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
@Id	
private int id;
private String street;
private String HouseNumber;
private String ZipCode;


@OneToOne
private Employee emp;
}
