package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	private Integer Id;
	private String Dname;
	private String Location;
	private Float salary;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Integer Id, String dname, String location, Float salary) {
		super();
		Id = Id;
		Dname = dname;
		Location = location;
		this.salary = salary;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		Id = Id;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Department [Id=" + Id + ", Dname=" + Dname + ", Location=" + Location + ", salary=" + salary + "]";
	}
	
	
}
