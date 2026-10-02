package Program;

class Swap {

    void display() {

        int a = 11, b = 4, c;
        System.out.println("The value of a before swapping: " + a);
        System.out.println("The value of b before swapping: " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("\nThe value of a after swapping: " + a);
        System.out.println("The value of b after swapping: " + b);
    }
}

class SwapDemo {

    public static void main(String[] args) {

        Swap s = new Swap();
        s.display();
    }
}