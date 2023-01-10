package com.practice3.practice3.Service;

import com.practice3.practice3.Entity.Employee;
import com.practice3.practice3.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpRepository empRepository;




    public List<Employee> getAll() {
        return empRepository.findAll();
    }

    public Employee getById(Long id){
        return empRepository.findById(id).orElse(null);
    }

    public Employee getByName(String name){
        return empRepository.findByName(name);

    }
    public  void  saveDetails(Employee info){
        empRepository.save(info);
    }

    public Employee updateDetails(Employee info){
        Employee existing= empRepository.findById(info.getId()).orElse(null);
        existing.setName(info.getName());
        existing.setAge(info.getAge());
        existing.setPlace(info.getPlace());
        return empRepository.save(existing);
    }

    public void deleteDetails(Long id){
        empRepository.deleteById(id);


    }

}
