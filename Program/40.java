package Program;

import java.util.Scanner;

class Reverse {

    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();

        sc.close();

        int demo = num;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        System.out.print("Reverse of number " + demo + ": " + rev + "\n");
    }
}

class ReverseDemo {

    public static void main(String[] args) {
        Reverse r = new Reverse();
        r.display();
    }
}