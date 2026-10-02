package Program;

import java.util.Scanner;

class VowelOrConsonant {

    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        sc.close();

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is a consonant.");
        }
    }
}

class VowelOrConsonantDemo {

    public static void main(String[] args) {

        VowelOrConsonant v = new VowelOrConsonant();
        v.display();
    }
}