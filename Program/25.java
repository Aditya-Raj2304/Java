package Program;

class Grade {

    void check() {

        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 50) {
            System.out.println("Grade D");
        } else if (marks >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}

class ElseIfLadder {

    public static void main(String[] args) {

        Grade g = new Grade();
        g.check();
    }
}