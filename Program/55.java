package Program;

class Pattern5 {
    void display() {

        int i, j, k;
        for (i = 1; i <= 15; i++) {

            for (j = 1; j <= 15 - i; j++) {
                System.out.print(" ");
            }

            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

class P5 {

    public static void main(String[] args) {

        Pattern5 p5 = new Pattern5();
        p5.display();
    }
}