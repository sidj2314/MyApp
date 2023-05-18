package com.nagarro.siddhantjain.MyApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyAppApplication {
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}

}
