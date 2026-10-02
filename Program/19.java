package Program;

class SimpleInterest {

    void display() {

        int p = 10000, r = 7;
        float t = 2.5f, si;
        si = (p * r * t) / 100;
        System.out.println("The simple interest is: " + si);
    }
}

class SimpleInterestDemo {

    public static void main(String[] args) {

        SimpleInterest s = new SimpleInterest();
        s.display();
    }
}