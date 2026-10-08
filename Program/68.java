package Program;

import java.util.Scanner;

class StringLength {

    String str;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        str = sc.nextLine();

        sc.close();

    }

    void display() {

        int length = str.length();

        System.out.println("Length of string = " + length);

    }

}

class StringLengthDemo {

    public static void main(String[] args) {

        StringLength s = new StringLength();

        s.accept();

        s.display();

    }

}