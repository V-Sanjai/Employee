package com.employee.employeemanagementsystem.services;

import com.employee.employeemanagementsystem.entity.EmployeeDetails;

import java.util.List;

public interface EmployeeDetailsService {
    public List<EmployeeDetails> getallemployees();

    public EmployeeDetails add(EmployeeDetails employeeDetails);

    public EmployeeDetails getoneemployee(int id);

    public void deleteoneemployee(int id);

    public EmployeeDetails updateemployee(EmployeeDetails employeeDetails);

}
