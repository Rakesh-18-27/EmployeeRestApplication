package com.employee.EmployeeRestApi.Model;

import java.util.List;

public class EmployeeModel1 {
    private String employeeName;
    private List<Benefit>  benefitDetails;

    public EmployeeModel1(String employeeName, List<Benefit> benefitDetails) {
        this.employeeName = employeeName;
        this.benefitDetails = benefitDetails;
    }

    public EmployeeModel1() {
    }

    @Override
    public String toString() {
        return "EmployeeModel1{" +
                "employeeName='" + employeeName + '\'' +
                ", benefitDetails=" + benefitDetails +
                '}';
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Benefit> getBenefitDetails() {
        return benefitDetails;
    }

    public void setBenefitDetails(List<Benefit> benefitDetails) {
        this.benefitDetails = benefitDetails;
    }
}
