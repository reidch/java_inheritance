package example.codeclan.com.employeestartpoint;

/**
 * Created by carolinereid on 24/10/2017.
 */

public class Manager extends Employee {
    public String deptName;

    public Manager(String deptName, int empId, String name, String ssn, double salary){
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}
