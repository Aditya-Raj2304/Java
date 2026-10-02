class Add {
    void add(int x, int y) {
        System.out.println("sum of two numbers: " + (x + y));
    }

    void add(int x, int y, int z) {
        System.out.println("sum of three numbers: " + (x + y + z));
    }
}

class Poly {

    public static void main(String args[]) {
        Add a = new Add();
        a.add(10, 15);
        a.add(10, 15, 20);
    }
}