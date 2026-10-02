package Program;

import java.lang.Math;
import java.util.Scanner;

class Square {

    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        sc.close();

        int sq = (int) Math.pow(num, 2);
        System.out.println("The square of " + num + " is: " + sq);
    }
}

class SquareDemo {

    public static void main(String[] args) {

        Square s = new Square();
        s.display();
    }
}