package Program;

import java.io.*;

class FloatInput {

    void display() throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter a float number: ");
        float num = Float.parseFloat(br.readLine());

        System.out.println("The entered float number is: " + num);
    }
}

class FloatInputDemo {

    public static void main(String[] args) throws IOException {

        FloatInput f = new FloatInput();
        f.display();
    }
}