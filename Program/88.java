package Program;

import java.util.Scanner;

class ArraySumAverage {

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

        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            sum = sum + a[i];

        }

        float average = (float) sum / a.length;

        System.out.println("Sum = " + sum);

        System.out.println("Average = " + average);

    }

}

class ArraySumAverageDemo {

    public static void main(String[] args) {

        ArraySumAverage a = new ArraySumAverage();

        a.accept();

        a.display();

    }

}