package com.miguel.lab42.service.impl;


import com.miguel.lab42.controller.dto.EmployeeStatusDTO;
import com.miguel.lab42.model.Employee;
import com.miguel.lab42.repository.EmployeeRepository;
import com.miguel.lab42.service.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void updateEmployeesStatus(Integer id, /*Enum status,*/ EmployeeStatusDTO employeeStatusDTO) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
    }

    @Override
    public void updateDepartment(String department, Employee employee) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());
       employeeRepository.save(employee);
    }

}
