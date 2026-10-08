package Program;

import java.util.Scanner;

class StringInput {

    String name;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");

        name = sc.nextLine();

        sc.close();

    }

    void display() {

        System.out.println("Entered name = " + name);

    }

}

class StringInputDemo {

    public static void main(String[] args) {

        StringInput s = new StringInput();

        s.accept();

        s.display();

    }

}