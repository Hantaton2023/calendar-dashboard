package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import main.model.Department;
import main.model.Employee;
import main.repository.DepartmentsRepository;
import main.repository.EmployeeRepository;

@RestController
public class MainController {

	@Autowired
	private DepartmentsRepository departmentsRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/depatment")
	@ResponseBody
	public List<Department> getDepartment() {
		return departmentsRepository.findAll();
	}

	@GetMapping("/employee")
	@ResponseBody
	public List<Employee> getEmployee() {
		return employeeRepository.findAll();
	}
}
