package FactoryDesignPattern.Employee;

import FactoryDesignPattern.EmployeeMain;

public class WebDeveloperEmployeeMain implements EmployeeMain {

    @Override
    public void getSalary() {
        System.out.println("Web developer Salary: 100K");
    }
}
