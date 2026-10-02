import java.util.Scanner;

public class Triangle {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of the triangle: ");
        int h = sc.nextInt();

        System.out.print("Enter the base of the triangle: ");
        int b = sc.nextInt();

        int area = (h * b) / 2;
        System.out.println("Area of triangle of height " + h + " and base " + b + ": " + area);
        
        sc.close();
    }
}