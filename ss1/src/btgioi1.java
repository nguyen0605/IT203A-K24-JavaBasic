public class btgioi1 {
    public static void main(String[] args) {

        // Ban đầu:
        // book1 trỏ tới chuỗi "Java Basic" trong Heap
        // book2 trỏ tới chuỗi "Python Intro" trong Heap
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        // temp trỏ tới cùng vùng nhớ Heap với book1
        String temp = book1;

        // book1 đổi sang trỏ tới vùng nhớ Heap của "Python Intro"
        book1 = book2;

        // book2 đổi sang trỏ tới vùng nhớ Heap mà temp đang trỏ ("Java Basic")
        book2 = temp;

        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
    }
}
