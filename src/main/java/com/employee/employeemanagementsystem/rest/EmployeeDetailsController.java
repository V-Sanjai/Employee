package com.employee.employeemanagementsystem.rest;

import com.employee.employeemanagementsystem.entity.EmployeeDetails;
import com.employee.employeemanagementsystem.services.EmployeeDetailsServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeDetailsController {


    @Autowired
    EmployeeDetailsServiceImple employeeDetailsServiceImple;

    @GetMapping("/getallemployee")
    public List<EmployeeDetails> getallemployees() {
        return employeeDetailsServiceImple.getallemployees();
    }

    @PostMapping("/addemployee")
    public EmployeeDetails add(@RequestBody EmployeeDetails employeeDetails) {
        return employeeDetailsServiceImple.add(employeeDetails);
    }

    @GetMapping("/getby/{id}")
    public EmployeeDetails getoneemployee(@PathVariable int id) {
        return employeeDetailsServiceImple.getoneemployee(id);
    }

    @DeleteMapping("/deleteby/{id}")
    public void deleteoneemployee(@PathVariable int id) {
        employeeDetailsServiceImple.deleteoneemployee(id);
    }

    @PutMapping("/update")
    public EmployeeDetails updateemployee(@RequestBody EmployeeDetails employeeDetails) {
        return employeeDetailsServiceImple.updateemployee(employeeDetails);
    }
}
