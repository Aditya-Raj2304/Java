package Program;

class Rectangle {

    void display() {

        int l = 17, b = 12;
        System.out.println("The area of rectangle: " + (l * b));
        System.out.println("The perimeter of rectangle: " + (2 * (l + b)));
    }
}

class RectangleDemo {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.display();
    }
}