package Aditya;

public class Divide {

    private int a, b;

    public Divide(int x, int y) {
        a = x;
        b = y;
    }

    public float quotient() {
        return (float) a / b;
    }

    public float remainder() {
        return a % b;
    }
}