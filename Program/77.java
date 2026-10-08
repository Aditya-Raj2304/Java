package Program;

import java.util.Scanner;

class ArrayDisplay {

    int a[];

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");

        int n = sc.nextInt();

        a = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");

            a[i] = sc.nextInt();

        }

        sc.close();

    }

    void display() {

        System.out.println("Array elements are:");

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);

        }

    }

}

class ArrayDisplayDemo {

    public static void main(String[] args) {

        ArrayDisplay a = new ArrayDisplay();

        a.accept();

        a.display();

    }

}