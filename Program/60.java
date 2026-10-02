package Program;

import java.util.Scanner;

class Trigonometry {

    void calculate() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double degree = sc.nextDouble();

        double radian = Math.toRadians(degree);

        double sine = Math.sin(radian);
        double cosine = Math.cos(radian);

        System.out.println("Sine value = " + sine);
        System.out.println("Cosine value = " + cosine);

        sc.close();
    }
}

class TrigonometryDemo {

    public static void main(String[] args) {

        Trigonometry t = new Trigonometry();
        t.calculate();
    }
}