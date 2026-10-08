package Program;

import java.util.Scanner;

class DigitSum {

    int num;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        num = sc.nextInt();

        sc.close();

    }

    void display() {

        int n = num;
        int sum = 0;

        while (n != 0) {

            int digit = n % 10;

            sum = sum + digit;

            n = n / 10;

        }

        System.out.println("Sum of digits = " + sum);

    }

}

class DigitSumDemo {

    public static void main(String[] args) {

        DigitSum d = new DigitSum();

        d.accept();

        d.display();

    }

}