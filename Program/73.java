package Program;

import java.util.Scanner;

class FloatInput {

    float num;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float number: ");

        num = sc.nextFloat();

        sc.close();

    }

    void display() {

        System.out.println("Entered float number = " + num);

    }

}

class FloatInputDemo {

    public static void main(String[] args) {

        FloatInput f = new FloatInput();

        f.accept();

        f.display();

    }

}