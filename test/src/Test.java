class Person {
    int age;
}

public class Test {
    static void change(Person p) {
        p.age = 20;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;

        change(p1);
        System.out.println(p1.age); // 👉 20
    }
}