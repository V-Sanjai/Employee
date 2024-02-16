package com.employee.employeemanagementsystem.repository;

import com.employee.employeemanagementsystem.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {
}
