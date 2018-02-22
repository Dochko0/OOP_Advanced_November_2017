package src.p03_employee_info.interfaces;

import src.p03_employee_info.Employee;

public interface Formatter {
    String format(Iterable<Employee> employees);
}
