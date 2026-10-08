package Program;

import java.util.Scanner;

class SumOfTwoNumbers {

    int a, b;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");

        a = sc.nextInt();

        System.out.print("Enter second number: ");

        b = sc.nextInt();

        sc.close();

    }

    void display() {

        int sum = a + b;

        System.out.println("Sum = " + sum);

    }

}

class SumOfTwoNumbersDemo {

    public static void main(String[] args) {

        SumOfTwoNumbers s = new SumOfTwoNumbers();

        s.accept();

        s.display();

    }

}