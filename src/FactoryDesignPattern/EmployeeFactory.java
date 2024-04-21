package FactoryDesignPattern;

import FactoryDesignPattern.Employee.AndroidDeveloperEmployeeMain;
import FactoryDesignPattern.Employee.IOSMobileDeveloperEmployeeMain;
import FactoryDesignPattern.Employee.WebDeveloperEmployeeMain;

public class EmployeeFactory {
    public static EmployeeMain getEmployeeSalary(String type) {
        String employeeType = type.trim();
        if(employeeType.equalsIgnoreCase("Android")) {
            return new AndroidDeveloperEmployeeMain();
        } else if(employeeType.equalsIgnoreCase("IOS Developer")) {
            return new IOSMobileDeveloperEmployeeMain();
        } else {
            return new WebDeveloperEmployeeMain();
        }
    }
}
