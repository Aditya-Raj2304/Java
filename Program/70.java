package Program;

import java.util.Scanner;

class CharacterInput {

    char ch;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");

        ch = sc.next().charAt(0);

        sc.close();

    }

    void display() {

        System.out.println("Entered character = " + ch);

    }

}

class CharacterInputDemo {

    public static void main(String[] args) {

        CharacterInput c = new CharacterInput();

        c.accept();

        c.display();

    }

}