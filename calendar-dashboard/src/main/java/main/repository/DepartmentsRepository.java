package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Department;
import main.model.User;

@Repository
public interface DepartmentsRepository extends JpaRepository<Department, Long> {

	List<Department> findAllDepartmentByUser(User user);
}
