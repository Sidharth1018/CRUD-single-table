package com.practice3.practice3.Controller;

import com.practice3.practice3.Entity.Employee;
import com.practice3.practice3.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService service;

    @GetMapping("/getall")
    private List<Employee> getAllEmployees(){
        return service.getAll();

    }

    @GetMapping("/get/{id}")
    private Employee getEmployeeById( @PathVariable Long id){
        return service.getById(id);

    }

    @GetMapping("/getBy/{name}")
    public Employee getEmployeeByName(@PathVariable String name){
        return service.getByName(name);
    }

    @PostMapping("/addDetails")
    public void addDetails(@RequestBody Employee info){
        service.saveDetails(info);
    }

    @PutMapping("/update")
    public void updateDetails(@RequestBody Employee info){
        service.updateDetails(info);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDetails(@PathVariable Long id){
        service.deleteDetails(id);
    }

}
