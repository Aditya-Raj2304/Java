class Me {
    String name;
    int age;

    void talk() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

public class Talk {
    public static void main(String[] args) {
        Me person = new Me();

        person.name = "John";
        person.age = 25;
        person.talk();
        }
    }
}