package Program;

class MathFunctions {

    void math() {

        double x = 25.5;
        double y = 2;
        int a = -10;
        int b = 20;

        System.out.println("sqrt(x) = " + Math.sqrt(x));
        System.out.println("pow(x, y) = " + Math.pow(x, y));

        System.out.println("sin(x) = " + Math.sin(x));
        System.out.println("cos(x) = " + Math.cos(x));
        System.out.println("tan(x) = " + Math.tan(x));

        System.out.println("ceil(x) = " + Math.ceil(x));
        System.out.println("floor(x) = " + Math.floor(x));
        System.out.println("rint(x) = " + Math.rint(x));

        System.out.println("abs(a) = " + Math.abs(a));

        System.out.println("max(a, b) = " + Math.max(a, b));
        System.out.println("min(a, b) = " + Math.min(a, b));
    }
}

class MathDemo {

    public static void main(String[] args) {

        MathFunctions m = new MathFunctions();
        m.math();
    }
}