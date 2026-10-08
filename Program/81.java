package Program;

import java.util.Scanner;

class OddEven {

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

            System.out.println(num + " is an odd number.");

        }

    }

}

class OddEvenDemo {

    public static void main(String[] args) {

        OddEven o = new OddEven();

        o.accept();

        o.display();

    }

}