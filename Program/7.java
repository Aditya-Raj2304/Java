package Program;

class AssignmentOperators {
    void operators() {

        int x = 10, y = 5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x += y;
        System.out.println("x += y = " + x);

        x -= y;
        System.out.println("x -= y = " + x);

        x *= y;
        System.out.println("x *= y = " + x);

        x /= y;
        System.out.println("x /= y = " + x);

        x %= y;
        System.out.println("x %= y = " + x);
    }
}

class Assignment {
    public static void main(String[] args) {
        AssignmentOperators a = new AssignmentOperators();
        a.operators();
    }
}