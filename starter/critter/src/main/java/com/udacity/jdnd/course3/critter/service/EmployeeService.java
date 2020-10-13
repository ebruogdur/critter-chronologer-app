package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.enums.EmployeeSkill;
import com.udacity.jdnd.course3.critter.model.Employee;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Set;

@Service
public interface EmployeeService {


    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(long employeeId);
    List<Employee> getAvailableEmployees(Set<EmployeeSkill> skills, DayOfWeek dayOfWeek);
}
