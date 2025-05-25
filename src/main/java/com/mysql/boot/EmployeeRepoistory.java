package com.mysql.boot;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepoistory extends  JpaRepository<Employee, Long>{
	

}
