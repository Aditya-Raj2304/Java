package Program;

class Display {

    void numbers() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class ForLoop {

    public static void main(String[] args) {

        Display d = new Display();
        d.numbers();
    }
}