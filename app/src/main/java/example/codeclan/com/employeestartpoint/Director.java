package example.codeclan.com.employeestartpoint;

/**
 * Created by carolinereid on 24/10/2017.
 */

public class Director extends Manager {
    private double budget;

    public Director(double budget, String deptName, int empId, String name, String ssn, double salary) {
        super(deptName, empId, name, ssn, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}