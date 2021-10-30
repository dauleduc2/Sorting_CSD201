/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
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
}
