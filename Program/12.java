package Program;

class Multiplication {

    void display() {

        int a = 10, b = 5, c;
        c = a * b;
        System.out.println("The multiplication of two numbers: " + c);
    }
}

class MultiplicationDemo {

    public static void main(String[] args) {

        Multiplication m = new Multiplication();
        m.display();
    }
}