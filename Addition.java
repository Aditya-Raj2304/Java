import java.util.Scanner;

class Addition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        int z = x + y;
        System.out.println("The sum of " + x + " and " + y + ": " + z);
        
        sc.close();
    }
}