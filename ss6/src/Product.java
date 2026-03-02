public class Product {
    private String maSP;
    private String tenSP;
    private double giaBan;

    public Product(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan);
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        if (giaBan > 0){
            this.giaBan = giaBan;
        }else {
            System.out.println("Giá phải lớn hơn 0");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {

        Product p1 = new Product("SP01", "Laptop", 15000000);

        p1.hienThiThongTin();

        // Thử set giá không hợp lệ
        p1.setGiaBan(-5000);

        // Kiểm tra lại
        p1.hienThiThongTin();
    }
}
