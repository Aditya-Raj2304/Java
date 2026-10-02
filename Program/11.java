package Program;

class Substraction {

    void display() {

        int a = 10, b = 5, c;
        c = a - b;
        System.out.println("The substraction of two numbers: " + c);
    }
}

class SubstractionDemo {

    public static void main(String[] args) {

        Substraction s = new Substraction();
        s.display();
    }
}