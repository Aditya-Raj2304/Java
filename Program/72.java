package Program;

import java.util.Scanner;

class IntegerInput {

    int num;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        num = sc.nextInt();

        sc.close();

    }

    void display() {

        System.out.println("Entered integer = " + num);

    }

}

class IntegerInputDemo {

    public static void main(String[] args) {

        IntegerInput i = new IntegerInput();

        i.accept();

        i.display();

    }

}