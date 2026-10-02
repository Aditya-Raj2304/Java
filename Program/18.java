package Program;

class SwapWithoutTemp {

    void display() {

        int a = 17, b = 6;
        System.out.println("The value of a before swapping: " + a);
        System.out.println("The value of b before swapping: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\nThe value of a after swapping: " + a);
        System.out.println("The value of b after swapping: " + b);
    }
}

class SwapWithoutTempDemo {

    public static void main(String[] args) {

        SwapWithoutTemp s = new SwapWithoutTemp();
        s.display();
    }
}