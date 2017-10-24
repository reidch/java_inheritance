package example.codeclan.com.employeestartpoint;

import static android.R.attr.id;

/**
 * Created by user on 28/08/2017.
 */

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return this.empId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public double raiseSalary(double amount) {
        this.salary += amount;
        return this.salary;
    }

    public String getSocialSecurityNumber() {

        return this.ssn;
    }

    //Extension, Prevent a negative value for the raiseSalary method:
    //    commented out so that the earlier RaiseSalary function works
//    public double raiseSalary(double amount) {
//        if (amount >= 0) {
//            this.salary += amount;
//        }
//        return this.salary;
//    }

}
