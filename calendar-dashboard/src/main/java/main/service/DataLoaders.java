package main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import main.enums.PostCategorie;
import main.model.Department;
import main.model.Employee;
import main.model.User;
import main.repository.DepartmentsRepository;
import main.repository.EmployeeRepository;
import main.repository.UserRepository;

@Configuration
@Slf4j
public class DataLoaders {

	@Autowired
	private DepartmentsRepository departmentsRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Bean
	CommandLineRunner dataLoader() {
		return args -> {

			for (int i = 0; i < 10; i++) {
				User user = User.builder()
					.mail("@")
					.password("password")
					.username("Dog")
					.phoneNumber("asdd")
					.build();
				Department dep = Department.builder()
					.description("")
					.name("ОТДЕЛ ХАНТАНТАТОН")
					.user(user)
					.build();
				Employee employee = Employee.builder()
					.department(dep)
					.name("")
					.post("")
					.postCategorie(PostCategorie.HIGHEST)
					.user(user)
					.build();
				userRepository.save(user);
				departmentsRepository.save(dep);
				employeeRepository.save(employee);
			}
		};
	}
}
