
import java.util.ArrayList;

public class EmployeeManager {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public void add(String ID, String name, int level) {
        Employee newEmployee = new Employee(ID, name, level);
        employeeList.add(newEmployee);
    }

    public void printAll() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    public void clear() {
        employeeList.clear();
    }
}
