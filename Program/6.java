package Program;

class RelationalOperators {
    void operators() {
        int x = 10, y = 5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("x > y = " + (x > y));
        System.out.println("x < y = " + (x < y));
        System.out.println("x >= y = " + (x >= y));
        System.out.println("x <= y = " + (x <= y));
        System.out.println("x == y = " + (x == y));
        System.out.println("x != y = " + (x != y));

    }
}

class Relational {
    public static void main(String[] args) {

        RelationalOperators r = new RelationalOperators();
        r.operators();
    }
}