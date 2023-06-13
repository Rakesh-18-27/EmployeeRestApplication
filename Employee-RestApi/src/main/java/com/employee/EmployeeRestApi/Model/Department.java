package com.employee.EmployeeRestApi.Model;

import jakarta.validation.constraints.Size;

public class Department {
    private int deptId;
    @Size(min = 3, max = 13)
    private String deptName;

    public int getDeptId() {

        return deptId;
    }

    public void setDeptId(int deptId) {

        this.deptId = deptId;
    }

    public String getDeptName() {

        return deptName;
    }

    public void setDeptName(String deptName) {

        this.deptName = deptName;
    }

    public Department(int deptId, String deptName) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Department() {

        super();
    }

    @Override
    public String toString() {

        return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
    }

}
