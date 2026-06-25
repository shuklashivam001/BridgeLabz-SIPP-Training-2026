package oops_practice.oops_practice.gcr_codebase.encapsulation_and_abstraction.scenario_based;

abstract class Employee {

    private int employeeId;
    private String employeeName;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class PayrollDemo {

    public static void main(String[] args) {

        FullTimeEmployee ft = new FullTimeEmployee();
        ft.setEmployeeId(101);
        ft.setEmployeeName("Rahul");
        ft.setMonthlySalary(50000);

        PartTimeEmployee pt = new PartTimeEmployee();
        pt.setEmployeeId(102);
        pt.setEmployeeName("Amit");
        pt.setHoursWorked(80);
        pt.setHourlyRate(300);

        ft.displayEmployeeInfo();
        System.out.println("Salary: " + ft.calculateSalary());

        System.out.println();

        pt.displayEmployeeInfo();
        System.out.println("Salary: " + pt.calculateSalary());
    }
}