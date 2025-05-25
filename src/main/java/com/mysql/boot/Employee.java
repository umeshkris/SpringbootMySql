package com.mysql.boot;

import org.hibernate.boot.model.relational.Sequence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private  Long id;
	@Column(name = "empname")
	private String emp_Name;
	
	@Column(name = "salary")
	private Double salary;
	
	@Column(name = "city")
	private String city;
	
	
	public String getEmp_Name() {
		return emp_Name;
	}



	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	
	
	
	public Employee() {
		
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_Name=" + emp_Name + ", salary=" + salary + ", city=" + city + "]";
	}
	

	
	
	
}
