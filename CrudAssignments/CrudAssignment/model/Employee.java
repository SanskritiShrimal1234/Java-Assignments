package com.javaCrudAssignment.CrudAssignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

//    public Employee(Integer empId, String empName, Integer empSalary) {
//        this.empId = empId;
//        this.empName = empName;
//        this.empSalary = empSalary;
//    }
//
//    public Integer getEmpId() {
//        return empId;
//    }
//
//    public void setEmpId(Integer empId) {
//        this.empId = empId;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//
//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }
//
//    public Integer getEmpSalary() {
//        return empSalary;
//    }
//
//    public void setEmpSalary(Integer empSalary) {
//        this.empSalary = empSalary;
//    }
    @Id
    private Integer empId;

    private String empName;

    private Integer empSalary;


}
