package Program;

class LogicalOperators {
    void operator(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + (!a));
    }
}

class Logical {
    public static void main(String[] args) {

        LogicalOperators l = new LogicalOperators();
        l.operator(args);
    }
}