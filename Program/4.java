package Program;

class BitwiseOperator {
    void operator(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
    }
}

class Bit {
    public static void main(String[] args) {

        BitwiseOperator b = new BitwiseOperator();
        b.operator(args);
    }
}
