package Program;

import java.util.Scanner;

class SumOfDigit {

    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of multiple digits: ");
        int num = sc.nextInt();

        sc.close();

        int demo = num;
        int sum = 0;

        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }

        System.out.print("Sum of digits of number " + demo + ": " + sum + "\n");
    }
}

class SumOfDigitDemo {

    public static void main(String[] args) {

        SumOfDigit s = new SumOfDigit();
        s.display();
    }
}