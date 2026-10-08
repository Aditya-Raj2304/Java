package Program;

import java.util.Scanner;

class Even {

    int num;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        num = sc.nextInt();

        sc.close();

    }

    void display() {

        if (num % 2 == 0) {

            System.out.println(num + " is an even number.");

        } else {

            System.out.println(num + " is not an even number.");

        }

    }

}

class EvenDemo {

    public static void main(String[] args) {

        Even e = new Even();

        e.accept();

        e.display();

    }

}