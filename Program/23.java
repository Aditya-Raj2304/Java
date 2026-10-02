package Program;

class CheckNumbers {

    void check() {

        int number = 15;

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}

class EvenOdd {

    public static void main(String[] args) {

        CheckNumbers c = new CheckNumbers();
        c.check();
    }
}