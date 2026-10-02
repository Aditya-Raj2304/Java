import java.io.*;

class Addition {

    void add() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter second number: ");
        int b = Integer.parseInt(br.readLine());

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}

public class Addbuffer {

    public static void main(String[] args) throws IOException {

        Addition addition = new Addition();
        addition.add();
    }
}