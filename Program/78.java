package Program;

import java.util.Scanner;

class StudentMarks {

    int marks[];
    int total;
    float percentage;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");

        int n = sc.nextInt();

        marks = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter marks of subject " + (i + 1) + ": ");

            marks[i] = sc.nextInt();

        }

        sc.close();

    }

    void display() {

        total = 0;

        for (int i = 0; i < marks.length; i++) {

            total = total + marks[i];

        }

        percentage = (float) total / marks.length;

        System.out.println("Total Marks = " + total);

        System.out.println("Percentage = " + percentage + "%");

    }

}

class StudentMarksDemo {

    public static void main(String[] args) {

        StudentMarks s = new StudentMarks();

        s.accept();

        s.display();

    }

}