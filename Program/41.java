package Program;

class StarTriangle {

    void display() {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

class StarTriangleDemo {

    public static void main(String[] args) {

        StarTriangle s = new StarTriangle();
        s.display();
    }
}