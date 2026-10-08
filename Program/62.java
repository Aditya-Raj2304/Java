package Program;

import java.util.Scanner;

class Power {

    int a, b;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base value: ");

        a = sc.nextInt();

        System.out.print("Enter power value: ");

        b = sc.nextInt();

        sc.close();
    }

    void display() {

        double result = Math.pow(a, b);

        System.out.println("Power = " + result);

    }

}

class PowerDemo {

    public static void main(String[] args) {

        Power p = new Power();

        p.accept();

        p.display();

    }

}