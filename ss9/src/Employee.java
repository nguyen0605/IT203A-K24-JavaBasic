class Employee {
    String ten;
    int luongCoBan;

    public Employee(String ten, int luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }
}

class Manager extends Employee{
    String phongBan;

    public Manager(String ten, int luongCoBan, String phongBan) {
        super(ten, luongCoBan);
        this.phongBan = phongBan;
    }

    void hienThiThongTinDayDu() {
        hienThiThongTin();
        System.out.println("Phòng ban: " + phongBan);
    }
}
