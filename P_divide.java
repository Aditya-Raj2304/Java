import Aditya.Divide;

public class P_divide {

    public static void main(String[] args) {

        Divide d = new Divide(50, 10);

        System.out.println("a / b: " + d.quotient());
        System.out.println("a % b: " + d.remainder());
    }
}
