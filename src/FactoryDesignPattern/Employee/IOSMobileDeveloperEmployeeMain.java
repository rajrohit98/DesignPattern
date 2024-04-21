package FactoryDesignPattern.Employee;

import FactoryDesignPattern.EmployeeMain;

public class IOSMobileDeveloperEmployeeMain implements EmployeeMain {

    @Override
    public void getSalary() {
        System.out.println("IOS Mobile developer Salary : 80K");
    }
}
