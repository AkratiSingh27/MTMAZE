package com.MTMAZE.MTMAZE.service;

import com.MTMAZE.MTMAZE.entity.Address;
import com.MTMAZE.MTMAZE.entity.Comments;
import com.MTMAZE.MTMAZE.entity.Employee;
import com.MTMAZE.MTMAZE.entity.User;
import com.MTMAZE.MTMAZE.respository.AddressRepository;
import com.MTMAZE.MTMAZE.respository.EmployeeRepository;
import com.MTMAZE.MTMAZE.respository.UserRepository;
import com.fasterxml.jackson.databind.DatabindException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import com.MTMAZE.MTMAZE.Dto.UserEmployeeDto;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    public Employee saveEmployee(UserEmployeeDto userEmployee) {

    Address permanentAddress = addressRepository.save(userEmployee.getPermanentAddress());
        Address presentAddress =     addressRepository.save(userEmployee.getPresentAddress());
        User user = new User();
        BeanUtils.copyProperties(userEmployee,user);

        if(null!=permanentAddress){
            user.setPermanentAddressId(permanentAddress.getId());
        }

        if(null!=presentAddress){
            user.setPresentAddressId(presentAddress.getId());
        }
        user =  userRepository.save(user);

        if(null!=user) {
            Employee employee = new Employee();
            Date date = new Date();
            employee.setUserId(user.getId());
            employee.setCreatedBy(user.getFirstName());
            employee.setCreationDate(date.toString());
            employee = employeeRepository.save(employee);
        }
        return null;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }


    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id); // Corrected this line
        return "Employee Removed!! " + id;
    }

    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setUserId(employee.getUserId());
            existingEmployee.setCreatedBy(employee.getCreatedBy());
            existingEmployee.setUpdatedBy(employee.getUpdatedBy());
            existingEmployee.setCreationDate(employee.getCreationDate());
            existingEmployee.setUpdationDate(employee.getUpdationDate());
            existingEmployee.setDeleted(employee.isDeleted());
            return employeeRepository.save(existingEmployee); // Use instance instead of class name
        }
        return null;
    }

}
