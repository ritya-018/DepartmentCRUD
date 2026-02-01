package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceIMPL implements DepartmentService {
	private DepartmentRepository dr;
	

	@Override
	public void add(Department department) {
		// TODO Auto-generated method stub
		dr.save(department);// Insert

	}

	@Override
	public List<Department> display() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

	@Override
	public Department delete(Integer Id) {
		// TODO Auto-generated method stub
		if (dr.findById(Id).isPresent()) {
			Department temp = dr.findById(Id).get();
			dr.deleteById(Id);
			return temp;
		}
		return null;
	}

	@Override
	public void update(Department department, Integer Id) {
		// TODO Auto-generated method stub
		department.setId(Id);
		dr.save(department);
	}

	@Override
	public Department search(Integer Id) {
		// TODO Auto-generated method stub
		if (dr.findById(Id).isPresent()) {
			Department temp = dr.findById(Id).get();
			return temp;
		}
		return null;
	}

}
