package Program;

import java.util.Scanner;

class ReverseString {

    String str;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        str = sc.nextLine();

        sc.close();

    }

    void display() {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);

        }

        System.out.println("Reversed string = " + reverse);

    }

}

class ReverseStringDemo {

    public static void main(String[] args) {

        ReverseString r = new ReverseString();

        r.accept();

        r.display();

    }

}