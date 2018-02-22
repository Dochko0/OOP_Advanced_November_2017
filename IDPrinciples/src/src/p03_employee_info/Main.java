package src.p03_employee_info;

import src.p03_employee_info.interfaces.Database;
import src.p03_employee_info.interfaces.Formatter;
import src.p03_employee_info.interfaces.InfoProvider;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        Database db = new EmployeeDatabase();
        InfoProvider employeeInfo = new EmployeeInfoProvider(db);
        Formatter formatter = new ConsoleFormatter();

        String output = formatter.format(employeeInfo.getEmployeesByName());
        System.out.println(output);
    }
}
