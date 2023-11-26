package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

  List<Department> findAllEmployeesByDepartment(Department department);
  
}
