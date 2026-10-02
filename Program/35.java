package Program;

class Sum1To10 {

    void display() {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}

class Sum1To10Demo {

    public static void main(String[] args) {

        Sum1To10 s = new Sum1To10();
        s.display();
    }
}