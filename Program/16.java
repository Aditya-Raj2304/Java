package Program;

class CelciusToFahrnehit {

    void display() {

        int c = 42;
        System.out.println("The temperature in Celcius: " + c);
        System.out.println("The temperature in Fahrnehit: " + ((c * 9 / 5) + 32));
    }
}

class CelciusToFahrnehitDemo {

    public static void main(String[] args) {

        CelciusToFahrnehit f = new CelciusToFahrnehit();
        f.display();
    }
}