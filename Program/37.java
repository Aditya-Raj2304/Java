package Program;

class Odd1To10 {

    void display() {

        System.out.print("Odd numbers from 1 to 10 are: ");

        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 10);
        System.out.println();
    }
}

class Odd1To10Demo {

    public static void main(String[] args) {

        Odd1To10 o = new Odd1To10();
        o.display();
    }
}