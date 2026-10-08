package Program;

import java.util.Scanner;

class StringMethods {

    String str;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        str = sc.nextLine();

        sc.close();

    }

    void display() {

        System.out.println("String = " + str);
        System.out.println("Length = " + str.length());
        System.out.println("Uppercase = " + str.toUpperCase());
        System.out.println("Lowercase = " + str.toLowerCase());
        System.out.println("First character = " + str.charAt(0));

    }

}

class StringMethodsDemo {

    public static void main(String[] args) {

        StringMethods s = new StringMethods();

        s.accept();

        s.display();

    }

}