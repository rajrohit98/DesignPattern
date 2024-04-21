package FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        //we need to avoid creation of new object for employee in a main class, to avoid create one more class and call the method from there just pass the type of employee...
//        Employee employee1 = new AndroidDeveloperEmployee();
//        employee1.getSalary();
//        Employee employee2 = new IOSMobileDeveloperEmployee();
//        employee2.getSalary();
//        Employee employee3 = new WebDeveloperEmployee();
//        employee3.getSalary();

        EmployeeMain employeeMain =  EmployeeFactory.getEmployeeSalary("Android");
        employeeMain.getSalary();
        EmployeeMain employeeMain2 =  EmployeeFactory.getEmployeeSalary("IOS Developer");
        employeeMain2.getSalary();
        EmployeeMain employeeMain3 =  EmployeeFactory.getEmployeeSalary("Web");
        employeeMain3.getSalary();

    }
}
