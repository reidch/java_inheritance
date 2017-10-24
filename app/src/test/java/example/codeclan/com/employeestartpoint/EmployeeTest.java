package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static android.R.attr.name;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;
    Manager manager;
    Admin admin;
    Engineer engineer;
    Director director;

    @Before
    public void before() {
        employee = new Employee(1, "Wilma", "AB123456C", 30000.00);
        manager = new Manager("HR", 2, "Wendy", "AB123789C", 40000.00);
        admin = new Admin(3, "Annie", "BC456789C", 20000.00);
        engineer = new Engineer(4, "Elizabeth", "CD456789X", 50000.00);
        director = new Director(6000000.00, "Board", 5, "Gail", "EF345678Z", 70000.00);
    }

//    @Test
//    public void newEmployeeIdIsZero() {
//        assertEquals(0, employee.getEmpId());
//    }
//
//    @Test
//    public void newEmployeeNameIsNull() {
//        assertNull(employee.getName());
//    }
//
//    @Test
//    public void newEmployeeSSnIsNull() {
//        assertNull(employee.getSocialSecurityNumber());
//    }
//
//    @Test
//    public void newEmployeeSalaryIsNull() {
//        assertEquals(0, employee.getSalary(), 0.01);
//    }

//    @Test
//    public void canSetEmployeeId() {
//        employee.setEmpId(1);
//        assertEquals(1, employee.getEmpId());
//    }

    @Test
    public void canSetEmployeeName() {
        employee.setName("Wilma");
        assertEquals("Wilma", employee.getName());
    }

//    @Test
//    public void canSetEmployeeSsn() {
//        employee.setSocialSecurityNumber("AB123456C");
//        assertEquals("AB123456C", employee.getSocialSecurityNumber());
//    }

//    @Test
//    public void canSetEmployeeSalary() {
//        employee.setSalary(30000.00);
//        assertEquals(30000.00, employee.getSalary(), 0.01);
//    }

//    @Test
//    public void canRaiseSalary() {
//        employee.raiseSalary(10000.00);
//        assertEquals(40000.00, employee.getSalary(), 0.1);
//    }

    @Test
    public void deptHasName(){
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void adminHasSsn() {
        assertEquals("BC456789C", admin.getSocialSecurityNumber());
    }

    @Test
    public void engineerSalary(){
        assertEquals(50000.00, engineer.getSalary(), 0.1);
    }

    @Test
    public void directorBudget(){
        assertEquals(6000000.00, director.getBudget(), 0.1);
    }

//  EXTENSION
    @Test
    public void canAdminRaiseSalary() {
        admin.raiseSalary(5000.00);
        assertEquals(25000.00, admin.getSalary(), 0.1);
    }

    @Test
    public void canSetDirectorName() {
        director.setName("Gail");
        assertEquals("Gail", director.getName());
    }

//    commented out so that the earlier canRaiseSalary test runs
//    @Test
//    public void canRaiseSalary() {
//        employee.raiseSalary(-5000.00);
//        assertEquals(30000.00, employee.getSalary(), 0.1);
//    }
}
