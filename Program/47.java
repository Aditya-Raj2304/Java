package Program;

import java.io.*;

class IntegerInput {

    void display() throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter an integer: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("The entered integer is: " + num);
    }
}

class IntegerInputDemo {

    public static void main(String[] args) throws IOException {

        IntegerInput i = new IntegerInput();
        i.display();
    }
}