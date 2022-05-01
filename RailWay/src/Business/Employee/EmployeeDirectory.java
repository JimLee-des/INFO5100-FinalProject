/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    // 添加新的员工
    public Employee createEmployee(String employeeName){
        Employee employee = new Employee();
        employee.setEmployeeName(employeeName);
        employeeList.add(employee);
        return employee;
    }
}