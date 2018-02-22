package src.p03_employee_info.interfaces;

import src.p03_employee_info.Employee;

import java.util.List;

public interface Database {
    List<Employee> readEmployees();
}
