package com.mysql.boot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepoistory respoistory;
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> employees = respoistory.findAll();
		return  ResponseEntity.ok(employees);
	}
	
	@PostMapping("/save-employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e){
		Employee emp = respoistory.save(e);
		return  ResponseEntity.ok(emp);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> findById(@PathVariable("id") String id)
	{
		Optional<Employee> e = respoistory.findById(Long.valueOf(id));
		
		return ResponseEntity.of(e);
	}
	
}
