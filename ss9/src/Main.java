public class Main {
    public static void main(String[] args) {

        //BAI 1 - KHA
        Student sv = new Student();

        sv.hoTen = "Nguyen Van A";
        sv.tuoi = 20;
        sv.maSinhVien = "SV001";
        sv.diemTrungBinh = 8.5;

        sv.hienThiThongTinStudent();

        //BAI 2 - KHA
//        Animal dog = new Dog();
//        dog.sound();

        Animal cat = new Cat();
        cat.sound();


        //BAI 3 - GIOI
        Manager m = new Manager("Nguyen Van B", 15000000, "IT");

        m.hienThiThongTinDayDu();


        //BAI 4 - GIOI
        Animal animal = new Dog();
        animal.sound();

        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.wagTail();
        }
    }
}