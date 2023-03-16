package com.jsgroup.sandeep.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsgroup.sandeep.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
