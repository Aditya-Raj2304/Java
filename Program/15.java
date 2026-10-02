package Program;

class Triangle {

    void display() {

        int b = 7, h = 5;
        System.out.println("The area of triangle: " + (0.5 * b * h));
    }
}

class TriangleDemo {

    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.display();
    }
}