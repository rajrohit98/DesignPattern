package SingleTonPattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee1 = Employee.getEmployee();
        Employee employee2 = Employee.getEmployee();
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        if(employee1.equals(employee2)) {
            System.out.println("Employee: only one object is created");
        }

        Employer employer1 = Employer.getEmployer();
        System.out.println(employer1.hashCode());

        Employer employer2 = Employer.getEmployer();
        System.out.println(employer2.hashCode());

        if(employer1.equals(employer2)) {
            System.out.println("Employer: only one object is created");
        }

    }
}