package Program;

import java.io.*;

class EmployeeDetails {

    void display() throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter employee ID: ");
        int id = Integer.parseInt(br.readLine());

        System.out.print("Enter employee name: ");
        String name = br.readLine();

        System.out.print("Enter employee salary: ");
        float salary = Float.parseFloat(br.readLine());

        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class EmployeeDetailsDemo {

    public static void main(String[] args) throws IOException {

        EmployeeDetails e = new EmployeeDetails();
        e.display();
    }
}