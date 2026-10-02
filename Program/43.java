package Program;

class DescendingNumbers {

    void display() {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

class DescendingNumbersDemo {

    public static void main(String[] args) {

        DescendingNumbers d = new DescendingNumbers();
        d.display();
    }
}