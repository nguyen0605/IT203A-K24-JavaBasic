public class Book {

    private String maSach;
    private String tenSach;
    private double gia;

    public Book(String maSach, String tenSach, double gia) {

        this.maSach = maSach;
        this.tenSach = tenSach;
        this.gia = gia;
    }

    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Giá: " + gia);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Book b1 = new Book("B01", "Java Core", 250000);
        b1.hienThiThongTin();
    }
}