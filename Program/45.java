package Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CharacterInput {

    void display() throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter a character: ");
        char ch = br.readLine().charAt(0);

        System.out.println("The entered character is: " + ch);
    }
}

class CharacterInputDemo {

    public static void main(String[] args) throws IOException {

        CharacterInput c = new CharacterInput();
        c.display();
    }
}