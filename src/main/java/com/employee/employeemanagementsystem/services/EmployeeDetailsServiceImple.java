package com.employee.employeemanagementsystem.services;

import com.employee.employeemanagementsystem.entity.EmployeeDetails;
import com.employee.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDetailsServiceImple implements EmployeeDetailsService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDetails> getallemployees() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeDetails add(EmployeeDetails employeeDetails) {
        return employeeRepository.save(employeeDetails);
    }

    @Override
    public EmployeeDetails getoneemployee(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteoneemployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeDetails updateemployee(EmployeeDetails employeeDetails) {
        return employeeRepository.save(employeeDetails);
    }
}
