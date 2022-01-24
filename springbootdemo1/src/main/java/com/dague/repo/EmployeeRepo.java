package com.dague.repo;

import com.dague.beans.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    public Employee findEmployeeBy(int id);

    public List<Employee> findAll();

    public Employee saveEmployee(Employee employee);

    public Employee editEmployee(Employee employee);

    public Employee deleteEmployee(int id);
}
