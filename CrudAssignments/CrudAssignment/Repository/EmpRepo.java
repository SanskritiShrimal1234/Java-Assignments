package com.javaCrudAssignment.CrudAssignment.Repository;

import com.javaCrudAssignment.CrudAssignment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpRepo extends JpaRepository<Employee,Integer> {



}
