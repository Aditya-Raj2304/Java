package Program;

import java.util.Scanner;

class LeapYear {

    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        sc.close();

        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

class LeapYearDemo {

    public static void main(String[] args) {

        LeapYear l = new LeapYear();
        l.display();
    }
}