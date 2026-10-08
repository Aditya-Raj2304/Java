package Program;

import java.util.Scanner;

class LargerNumber {

    int a, b;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");

        a = sc.nextInt();

        System.out.print("Enter second integer: ");

        b = sc.nextInt();

        sc.close();

    }

    void display() {

        if (a > b) {

            System.out.println("Larger number = " + a);

        } else if (b > a) {

            System.out.println("Larger number = " + b);

        } else {

            System.out.println("Both numbers are equal.");

        }

    }

}

class LargerNumberDemo {

    public static void main(String[] args) {

        LargerNumber l = new LargerNumber();

        l.accept();

        l.display();

    }

}