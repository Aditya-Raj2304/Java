package Program;

class InfiniteFor {

    void display() {

        for (int i = 1;; i++) {

            System.out.println(i);

            if (i == 10) {
                break;
            }
        }
    }
}

class InfiniteForDemo {

    public static void main(String[] args) {

        InfiniteFor i = new InfiniteFor();
        i.display();
    }
}