package com.practice3.practice3.Repository;

import com.practice3.practice3.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee,Long> {


     Employee findByName(String name);

     void deleteById(Long id);
}
