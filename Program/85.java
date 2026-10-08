package Program;

import java.util.Scanner;

class Factorial {

    int num;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        num = sc.nextInt();

        sc.close();

    }

    void display() {

        int fact = 1;

        for (int i = 1; i <= num; i++) {

            fact = fact * i;

        }

        System.out.println("Factorial = " + fact);

    }

}

class FactorialDemo {

    public static void main(String[] args) {

        Factorial f = new Factorial();

        f.accept();

        f.display();

    }

}