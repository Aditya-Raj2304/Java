package Program;

class SumEven1To100 {

    void display() {

        int even = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even += i;
            }
        }
        System.out.print("Sum of even number between 1 to 100: " + even + "\n");
    }
}

class SumOdd1To100 {

    void display() {

        int odd = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                odd += i;
            }
        }
        System.out.println("Sum of odd number between 1 to 100: " + odd);
        System.out.println();
    }
}

class SumDemo {

    public static void main(String[] args) {

        SumEven1To100 e = new SumEven1To100();
        e.display();

        SumOdd1To100 o = new SumOdd1To100();
        o.display();
    }
}