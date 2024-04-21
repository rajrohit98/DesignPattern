package FactoryDesignPattern.Employee;

import FactoryDesignPattern.EmployeeMain;

public class AndroidDeveloperEmployeeMain implements EmployeeMain {

    @Override
    public void getSalary() {
        System.out.println("Android Developer Salary: 120K");
    }
}
