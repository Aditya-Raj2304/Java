package Program;

import java.util.Scanner;

class Minimum {

    int a, b;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");

        a = sc.nextInt();

        System.out.print("Enter second value: ");

        b = sc.nextInt();

        sc.close();

    }

    void display() {

        int min = Math.min(a, b);

        System.out.println("Smaller value = " + min);

    }

}

class MinimumDemo {

    public static void main(String[] args) {

        Minimum m = new Minimum();

        m.accept();

        m.display();

    }

}