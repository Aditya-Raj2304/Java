package Program;

import java.util.Scanner;

class GreaterNumber {

    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        if (a >= b && a >= c) {
            System.out.println("The greatest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The greatest number is: " + b);
        } else {
            System.out.println("The greatest number is: " + c);
        }
    }
}

class GreaterNumberDemo {

    public static void main(String[] args) {

        GreaterNumber g = new GreaterNumber();
        g.display();
    }
}