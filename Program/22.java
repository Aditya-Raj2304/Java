package Program;

class CheckNumber {

    void check() {

        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        }

    }
}

class IfStatement {

    public static void main(String[] args) {

        CheckNumber c = new CheckNumber();
        c.check();
    }
}