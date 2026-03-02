public class Employee {
    private String maNV;
    private String tenNV;
    private double luong;

    public Employee(){
        System.out.println("Tạo nhân viên mặc định");
    }

    public Employee(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
    }

    public Employee(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Tên NV: " + tenNV);
        System.out.println("Lương: " + luong);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Dùng constructor không tham số
        Employee e1 = new Employee();
        e1.hienThiThongTin();

        // Dùng constructor 2 tham số
        Employee e2 = new Employee("NV01", "Nguyen Van A");
        e2.hienThiThongTin();

        // Dùng constructor đầy đủ
        Employee e3 = new Employee("NV02", "Tran Thi B", 15000000);
        e3.hienThiThongTin();
    }
}
