package com.javaCrudAssignment.CrudAssignment.Controller;

import com.javaCrudAssignment.CrudAssignment.Service.EmpService;
import com.javaCrudAssignment.CrudAssignment.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {
    @Autowired
    public EmpService empService;

    @GetMapping("/allemployees")
    public List<Employee> getAllEmployees() {
        return this.empService.displayAllEmp();
    }

    @PostMapping("/createemployee")
    public String createEmployee(@RequestBody Employee emp) {
        return this.empService.createEmp(emp);
    }

    @GetMapping("/findemployee")
    public Optional<Employee> findEmployee(@RequestParam Integer id) {
        return empService.displayEmp(id);
    }

    @DeleteMapping("/deleteemployee")
    public String deleteEmployee(@RequestParam Integer id) {
        return empService.deleteEmp(id);
    }



}
