package Program;

import java.util.Scanner;

class SmallestArrayElement {

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

        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] < smallest) {

                smallest = a[i];

            }

        }

        System.out.println("Smallest element = " + smallest);

    }

}

class SmallestArrayElementDemo {

    public static void main(String[] args) {

        SmallestArrayElement s = new SmallestArrayElement();

        s.accept();

        s.display();

    }

}