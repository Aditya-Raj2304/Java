package Program;

class Even1To10 {

    void display() {

        System.out.print("Even numbers from 1 to 10 are: ");

        int i = 1;
        while (i <= 10) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}

class Even1To10Demo {

    public static void main(String[] args) {

        Even1To10 e = new Even1To10();
        e.display();
    }
}