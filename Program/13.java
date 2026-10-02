package Program;

class Division {

    void display() {

        int a = 13, b = 5;
        System.out.println("The Quotient of two numbers: " + (a / b));
        System.out.println("The Remainder of two numbers: " + (a % b));
    }
}

class DivisionDemo {

    public static void main(String[] args) {

        Division d = new Division();
        d.display();
    }
}