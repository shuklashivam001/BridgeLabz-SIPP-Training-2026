package core_java_practice.core_java_practice.gcr_codebase.Java_IO.scenario_based;

import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {

    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name,
             String department, double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSkillAssignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp =
                    new Employee(id, name, dept, salary);

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream("employee.ser"));

            oos.writeObject(emp);
            oos.close();

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("employee.ser"));

            Employee e = (Employee) ois.readObject();

            System.out.println("\nRecovered Employee Data");
            System.out.println("ID: " + e.employeeId);
            System.out.println("Name: " + e.name);
            System.out.println("Department: " + e.department);
            System.out.println("Salary: " + e.salary);

            ois.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}