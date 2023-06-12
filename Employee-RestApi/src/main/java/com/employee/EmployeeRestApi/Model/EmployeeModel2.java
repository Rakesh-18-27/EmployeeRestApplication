package com.employee.EmployeeRestApi.Model;

public class EmployeeModel2 {
    private String employeeName;

    public String getEmployeeName() {
        return employeeName;
    }

    public EmployeeModel2(String employeeName, Location locationDetails) {
        this.employeeName = employeeName;
        this.locationDetails = locationDetails;
    }

    @Override
    public String toString() {
        return "EmployeeModel2{" +
                "employeeName='" + employeeName + '\'' +
                ", locationDetails=" + locationDetails +
                '}';
    }

    public EmployeeModel2() {
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Location getLocationDetails() {
        return locationDetails;
    }

    public void setLocationDetails(Location locationDetails) {
        this.locationDetails = locationDetails;
    }

    private Location locationDetails;

}
