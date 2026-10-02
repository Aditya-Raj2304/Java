package Program;

class ArithematicOperators {
    void operators() {

        int x = 10, y = 5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

    }
}

class Arithmetic {
    public static void main(String[] args) {

        ArithematicOperators a = new ArithematicOperators();
        a.operators();
    }
}