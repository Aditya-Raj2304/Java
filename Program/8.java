package Program;

class IncrementDecrementOperators {
    void operators() {

        int x = 10, y = 5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("x++ = " + (x++));
        System.out.println("x-- = " + (x--));
        System.out.println("++y = " + (++y));
        System.out.println("--y = " + (--y));
    }
}

class IncrementDecrement {
    public static void main(String[] args) {
        IncrementDecrementOperators i = new IncrementDecrementOperators();
        i.operators();
    }
}