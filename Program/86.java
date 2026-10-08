package Program;

import java.util.Scanner;

class LargestArrayElement {

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

        int largest = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > largest) {

                largest = a[i];

            }

        }

        System.out.println("Largest element = " + largest);

    }

}

class LargestArrayElementDemo {

    public static void main(String[] args) {

        LargestArrayElement l = new LargestArrayElement();

        l.accept();

        l.display();

    }

}