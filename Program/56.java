package Program;

import java.io.*;

class Employee {

    int empid;
    String empname;
    float salary;

    void getval() throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter empid: ");
        empid = Integer.parseInt(br.readLine());

        System.out.print("Enter empname: ");
        empname = br.readLine();

        System.out.print("Enter salary: ");
        salary = Float.parseFloat(br.readLine());
    }

    void showval() {

        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Employee Salary: " + salary);
    }
}

class EmployeeDemo {

    public static void main(String[] args) throws IOException {

        Employee e = new Employee();

        e.getval();
        e.showval();
    }
}