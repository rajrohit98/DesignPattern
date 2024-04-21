package SingleTonPattern;

public class Employee {
    private static Employee employee;
    private Employee() {
    }

    //Lazy way to do (when this function is getting called that time only it will create a object
    public static Employee getEmployee() {
        if(employee == null) {
            synchronized (Employee.class) { //using this to make thread safe for singleton in a lazy way
                employee =  new Employee();
            }
        }
        return employee;
    }
}
