package Program;

class Display {

    void numbers() {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}

class DoWhile {

    public static void main(String[] args) {
        
        Display d = new Display();
        d.numbers();
    }
}