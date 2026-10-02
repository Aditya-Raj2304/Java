package Program;

class ConditionalOperators {
    void operators() {
        int x = 10, y = 5;

        System.out.println("X = " + x);
        System.out.println("y = " + y);

        System.out.println("!(x > y) = " + !(x > y));
        System.out.println("!(x < y) = " + !(x < y));
        System.out.println("x > y && x < y = " + (x > y && x < y));
        System.out.println("x > y || x < y = " + (x > y || x < y));
        System.out.println("x > y ? x : y = " + (x > y ? x : y));
        System.out.println("x > y ^ x < y = " + (x > y ^ x < y));
    }
}

class Conditional {
    public static void main(String[] args) {
        ConditionalOperators c = new ConditionalOperators();
        c.operators();
    }
}