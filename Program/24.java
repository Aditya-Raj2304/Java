package Program;

class GreatestNumber {

    void check() {

        int a = 10;
        int b = 25;
        int c = 15;

        if (a > b) {

            if (a > c) {
                System.out.println(a + " is the greatest number.");
            } else {
                System.out.println(c + " is the greatest number.");
            }

        } else {

            if (b > c) {
                System.out.println(b + " is the greatest number.");
            } else {
                System.out.println(c + " is the greatest number.");
            }
        }
    }
}

class NestedIfElse {

    public static void main(String[] args) {

        GreatestNumber g = new GreatestNumber();
        g.check();
    }
}