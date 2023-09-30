package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Mission {
@Id
private int id;
private String name;
private Date period;

@ManyToMany
@JoinTable(
		name="mission_empl",
		joinColumns = @JoinColumn(name="missions_id"),
		inverseJoinColumns =  @JoinColumn(name="emploList_id")
		)

private List<Employee> emploList;
}
