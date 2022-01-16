package com.example.MercSpringMVCDemo.service;

import java.util.List;

import com.example.MercSpringMVCDemo.model.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployee();
	Employee getEmployeeById(int empId);
	void addEmployee(Employee employee);
	void updateEmployee(Employee employee, int empId);
	void deleteEmployee(int empId);
	List<Employee> getEmployeeByDept(String deptName);

}
