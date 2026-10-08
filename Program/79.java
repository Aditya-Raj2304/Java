package Program;

import java.util.Scanner;

class NumberCheck {

    int num;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        num = sc.nextInt();

        sc.close();

    }

    void display() {

        if (num > 0) {

            System.out.println(num + " is a positive number.");

        } else if (num < 0) {

            System.out.println(num + " is a negative number.");

        } else {

            System.out.println("The number is zero.");

        }

    }

}

class NumberCheckDemo {

    public static void main(String[] args) {

        NumberCheck n = new NumberCheck();

        n.accept();

        n.display();

    }

}