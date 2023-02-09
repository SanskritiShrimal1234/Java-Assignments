package com.javaCrudAssignment.CrudAssignment.Service;

import com.javaCrudAssignment.CrudAssignment.Repository.EmpRepo;
import com.javaCrudAssignment.CrudAssignment.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    public EmpRepo emprepo;

    //Creating Employee
    public String createEmp(Employee emp)
    {
        if(this.emprepo.existsById(emp.getEmpId()))
        {
            return "Employee already exists" ;
        }
        else{
            this.emprepo.save(emp);
            return "Details successfully saved";
        }
    }

    //Display all Employee
    public List<Employee> displayAllEmp()
    {
        return this.emprepo.findAll();
    }

    //Display a single Employee

    public Optional<Employee> displayEmp(Integer id)
    {
        return this.emprepo.findById(id);
    }

    public String deleteEmp(Integer id) {
        emprepo.deleteById(id);
        return "employee deleted successfully";

    }
    //delete an Employee
//    public String deleteEmp(Employee emp)
//    {
//        this.emprepo.deleteById(emp.getEmpId());
//        return "Successfully Deleted";
//    }

    //update an employee
//    public String updateEmp(Employee emp)
//    {
////        this.emprepo.findById(emp.getEmpId());
//        if(this.emprepo.existsById(emp.getEmpId()))
//        {
//
//        }
//        else{
//            return "Employee doesnt exist";
//        }
//    }
//
//        return "Successfully Deleted";
//    }

}
