package Program;

import java.util.Scanner;

class LargestNumber {

    int a, b, c;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");

        a = sc.nextInt();

        System.out.print("Enter second number: ");

        b = sc.nextInt();

        System.out.print("Enter third number: ");

        c = sc.nextInt();

        sc.close();

    }

    void display() {

        if (a >= b && a >= c) {

            System.out.println("Largest number = " + a);

        } else if (b >= a && b >= c) {

            System.out.println("Largest number = " + b);

        } else {

            System.out.println("Largest number = " + c);

        }

    }

}

class LargestNumberDemo {

    public static void main(String[] args) {

        LargestNumber l = new LargestNumber();

        l.accept();

        l.display();

    }

}