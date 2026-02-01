package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Department;

public interface DepartmentService {

	void add(Department department);

	List<Department> display();

	Department delete(Integer Id);

	void update(Department department, Integer Id);

	Department search(Integer Id);

}
