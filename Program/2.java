package Program;

class Sum {

    void add(int x, int y) {

        System.out.println("sum of two numbers: " + (x + y));
    }

}

class Add {

    public static void main(String[] args) {

        Sum s = new Sum();
        s.add(10, 15);
    }
}
