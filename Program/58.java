package Program;

class Loop {

    void display() {

        for (int i = 10; i <= 100; i = i + 10) {

            System.out.println(i);
        }
    }
}

class LoopDemo {

    public static void main(String[] args) {

        Loop l = new Loop();
        l.display();
    }
}