package com.codegym.casestudy.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int educationDegreeId;

    private String educationDegreeName;

    @OneToMany(mappedBy = "position")
    private List<Employee> employees;

    public int getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(int educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
