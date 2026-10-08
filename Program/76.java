package Program;

import java.util.Scanner;

class FloatSum {

    float a, b;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first float number: ");

        a = sc.nextFloat();

        System.out.print("Enter second float number: ");

        b = sc.nextFloat();

        sc.close();

    }

    void display() {

        float sum = a + b;

        System.out.println("Sum = " + sum);

    }

}

class FloatSumDemo {

    public static void main(String[] args) {

        FloatSum f = new FloatSum();

        f.accept();

        f.display();

    }

}