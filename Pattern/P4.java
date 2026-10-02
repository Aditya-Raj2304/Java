package Pattern;

class Patter4 {

    void display() {

        int i, j;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class P4 {

    public static void main(String[] args) {

        Patter4 p4 = new Patter4();
        p4.display();
    }
}
