package Program;

import java.util.Scanner;

class ReplaceCharacter {

    String str;
    char oldChar, newChar;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        str = sc.nextLine();

        System.out.print("Enter character to replace: ");

        oldChar = sc.next().charAt(0);

        System.out.print("Enter new character: ");

        newChar = sc.next().charAt(0);

        sc.close();

    }

    void display() {

        String result = str.replace(oldChar, newChar);

        System.out.println("Original String = " + str);

        System.out.println("Replaced String = " + result);

    }

}

class ReplaceCharacterDemo {

    public static void main(String[] args) {

        ReplaceCharacter r = new ReplaceCharacter();

        r.accept();

        r.display();

    }

}