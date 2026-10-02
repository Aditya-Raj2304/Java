package Program;

class CheckNumber {

    void check() {

        int number = -25;

        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}

class PositiveNegative {

    public static void main(String[] args) {

        CheckNumber c = new CheckNumber();
        c.check();
    }
}