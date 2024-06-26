package com.MTMAZE.MTMAZE.respository;

import com.MTMAZE.MTMAZE.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {
    Employee findByName(String name);

}


