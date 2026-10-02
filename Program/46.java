package Program;

import java.io.*;

class StringInput {

    void display() throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.println("Your name is: " + name);
    }
}

class StringInputDemo {

    public static void main(String[] args) throws IOException {

        StringInput s = new StringInput();
        s.display();
    }
}