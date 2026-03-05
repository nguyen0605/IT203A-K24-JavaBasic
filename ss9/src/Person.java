class Person {
    String hoTen;
    int tuoi;

    void hienThiThongTin(){
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
    }
}

class Student extends Person {
    String maSinhVien;
    double diemTrungBinh;

    void hienThiThongTinStudent() {
        hienThiThongTin();
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }
}

