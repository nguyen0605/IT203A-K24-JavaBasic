public class Account {
    String username;
    String password;
    String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePass(String newPass){
        this.password = newPass;
        System.out.println("Đổi mật khẩu thành công!");
    }

    public void hienThiThongTin() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ********");
    }

    public static void main(String[] args) {
        Account user1 = new Account("Nguyen Van Khanh", "Nguyenvankhanh1@", "nguyenvankhanh@gmail.com");

        user1.hienThiThongTin();

        user1.changePass("nguyenvankhanh@123");

        user1.hienThiThongTin();
    }
}
