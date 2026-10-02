package Pattern;

class Pattern2 {

    void display() {

        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

public class P2 {

    public static void main(String[] args) {

        Pattern2 p2 = new Pattern2();
        p2.display();
    }
}