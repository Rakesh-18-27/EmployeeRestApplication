package com.employee.EmployeeRestApi.Model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.util.List;

public class EmployeeModel {
    private int employeeId;
    @NotEmpty(message = "employee name must not be empty")
    private String employeeName;
    @Positive(message = "salary should be in positive values")
    private Double salary;
    @Valid
    private Department department;
    @Valid
    private Location location;
    private List<@Valid Benefit> benefits;


    public int getEmployeeId() {

        return employeeId;
    }

    public void setEmployeeId(int employeeId) {

        this.employeeId = employeeId;
    }

    public String getEmployeeName() {

        return employeeName;
    }

    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {

        this.salary = salary;
    }

    public Department getDepartment() {

        return department;
    }

    public void setDepartment(Department department) {

        this.department = department;
    }

    public Location getLocation() {

        return location;
    }

    public void setLocation(Location location) {

        this.location = location;
    }

    public List<Benefit> getBenefits() {

        return benefits;
    }

    public void setBenefits(List<Benefit> benefits) {

        this.benefits = benefits;
    }


    public EmployeeModel() {
    }

    public EmployeeModel(int employeeId, String employeeName, Double salary, Department department, Location location, List<Benefit> benefits) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.department = department;
        this.location = location;
        this.benefits = benefits;
    }
}
