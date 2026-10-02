package Program;

class Pattern3 {

    void display() {

        int i, j;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class P3 {

    public static void main(String[] args) {

        Pattern3 p3 = new Pattern3();
        p3.display();
    }
}
