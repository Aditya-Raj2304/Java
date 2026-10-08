package Program;

import java.util.Scanner;

class Employee {

    int id;
    String name;
    float salary;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");

        id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter employee name: ");

        name = sc.nextLine();

        System.out.print("Enter employee salary: ");

        salary = sc.nextFloat();

        sc.close();

    }

    void display() {

        System.out.println("\nEmployee Details");

        System.out.println("Employee ID = " + id);

        System.out.println("Employee Name = " + name);

        System.out.println("Employee Salary = " + salary);

    }

}

class EmployeeDemo {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.accept();

        e.display();

    }

}