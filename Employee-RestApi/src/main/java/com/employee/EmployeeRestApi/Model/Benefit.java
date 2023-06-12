package com.employee.EmployeeRestApi.Model;

public class Benefit {
    private int benefitId;
    private String benefitName;

    public int getBenefitId() {
        return benefitId;
    }

    public Benefit() {
    }

    @Override
    public String toString() {
        return "Benefit{" +
                "benefitId=" + benefitId +
                ", benefitName='" + benefitName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Benefit(int benefitId, String benefitName, String description) {
        this.benefitId = benefitId;
        this.benefitName = benefitName;
        this.description = description;
    }

    public void setBenefitId(int benefitId) {
        this.benefitId = benefitId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;


}
