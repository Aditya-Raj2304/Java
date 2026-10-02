package Program;

class GreaterNumebr {

    void display() {

        int a = 23, b = 45;
        System.out.println("The greater number: " + (a > b ? a : b));
    }
}

class GreaterNumebrDemo {

    public static void main(String[] args) {

        GreaterNumebr g = new GreaterNumebr();
        g.display();
    }
}