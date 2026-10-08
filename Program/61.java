package Program;

import java.util.Scanner;

class Maximum {
    int a, b;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        a = sc.nextInt();

        System.out.print("Enter second value: ");
        b = sc.nextInt();

        sc.close();
    }

    void display() {
        int max = Math.max(a, b);

        System.out.println("Maximum value = " + max);
    }
}

class MaximumDemo {
    public static void main(String[] args) {
        Maximum m = new Maximum();

        m.accept();
        m.display();
    }
}