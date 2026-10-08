package Program;

import java.util.Scanner;

class StringManipulation {

    String str;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        str = sc.nextLine();

        sc.close();

    }

    void display() {

        System.out.println("Original String = " + str);

        System.out.println("Length = " + str.length());

        System.out.println("Uppercase = " + str.toUpperCase());

        System.out.println("Lowercase = " + str.toLowerCase());

        System.out.println("First character = " + str.charAt(0));

        System.out.println("Substring = " + str.substring(0, str.length() / 2));

        System.out.println("Replaced String = " + str.replace('a', 'A'));

    }

}

class StringManipulationDemo {

    public static void main(String[] args) {

        StringManipulation s = new StringManipulation();

        s.accept();

        s.display();

    }

}