package Program;

import java.util.Scanner;

class MultliplicationTable {

    void display() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();

        System.out.print("Enter the range of multiplication table: ");
        int r = sc.nextInt();

        sc.close();

        for (int i = 0; i <= r; i++) {
            System.out.println("" + num + " * " + i + " = " + (num * i));
        }
    }
}

class MultliplicationTableDemo {

    public static void main(String[] args) {

        MultliplicationTable m = new MultliplicationTable();
        m.display();
    }
}