package com.employee.employeemanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeenumber;
    private String employeename;
    private String addressline1;
    private String addressline2;
    private String city;
    private int zipcode;

    public EmployeeDetails() {
    }

    public EmployeeDetails(int employeenumber, String employeename, String addressline1, String addressline2, String city, int zipcode) {
        this.employeenumber = employeenumber;
        this.employeename = employeename;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.city = city;
        this.zipcode = zipcode;
    }

    public int getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(int employeenumber) {
        this.employeenumber = employeenumber;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" + "employeenumber=" + employeenumber + ", employeename='" + employeename + '\'' + ", addressline1='" + addressline1 + '\'' + ", addressline2='" + addressline2 + '\'' + ", city='" + city + '\'' + ", zipcode=" + zipcode + '}';
    }
}
