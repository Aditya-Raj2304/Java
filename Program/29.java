package Program;

class Display {

    void numbers() {

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

class WhileLoop {

    public static void main(String[] args) {

        Display d = new Display();
        d.numbers();
    }
}