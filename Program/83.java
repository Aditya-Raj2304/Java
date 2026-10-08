package Program;

import java.util.Scanner;

class MultiplicationTable {

    int num;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        num = sc.nextInt();

        sc.close();

    }

    void display() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = " + (num * i));

        }

    }

}

class MultiplicationTableDemo {

    public static void main(String[] args) {

        MultiplicationTable m = new MultiplicationTable();

        m.accept();

        m.display();

    }

}