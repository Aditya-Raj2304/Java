package Program;

import java.util.Scanner;

class Divisible {

    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        sc.close();

        if (a % 7 == 0 && a % 11 == 0) {
            System.out.println("The number is divisible by 7 and 11.");
        } else {
            System.out.println("The number is not divisible by 7 and 11.");
        }
    }
}

class DivisibleDemo {

    public static void main(String[] args) {

        Divisible d = new Divisible();
        d.display();
    }
}