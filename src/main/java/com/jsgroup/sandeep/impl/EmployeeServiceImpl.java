package com.jsgroup.sandeep.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsgroup.sandeep.model.Employee;
import com.jsgroup.sandeep.repo.EmployeeRepository;
import com.jsgroup.sandeep.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo; //HAS-A
	
	@Override
	public Integer saveEmployee(Employee e) {
		//calculations
		double esal = e.getEsal();
		double hra = esal * 20/100.0;
		double da = esal * 10/100.0;
		e.setHra(hra);
		e.setDa(da);
		//save employee
		e = repo.save(e);
		return e.getEid();
}
}
