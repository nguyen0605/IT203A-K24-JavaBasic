import java.util.regex.Pattern;

public class User {
    // 1) Thuộc tính private (Encapsulation)
    private int id;
    private String username;
    private String password;
    private String email;

    // Regex email đơn giản (đủ dùng cho bài tập cơ bản)
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    // 2) Constructor khởi tạo đầy đủ
    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password); // dùng setter để kiểm soát
        setEmail(email);       // dùng setter để kiểm soát
    }

    // 3) Getter
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // (Không bắt buộc phải có getter password; thường không nên public ra)
    // public String getPassword() { return password; }

    // 4) Setter (kiểm soát dữ liệu)

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            System.out.println("Password không được rỗng! Giữ nguyên password cũ.");
            return;
        }
        this.password = password;
    }

    public void setEmail(String email) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            System.out.println("Email không hợp lệ! Giữ nguyên email cũ.");
            return;
        }
        this.email = email;
    }

    // 5) Phương thức hiển thị (ẩn password)
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ********");
        System.out.println("------------------------");
    }

    // 6) Main test nhiều trường hợp sai dữ liệu
    public static void main(String[] args) {

        // Đúng dữ liệu
        User u1 = new User(1, "nam123", "123456", "nam@gmail.com");
        u1.displayInfo();

        // Sai email ngay từ đầu (bị chặn -> email sẽ null vì chưa có giá trị cũ để giữ)
        User u2 = new User(2, "lan456", "abc", "lan-gmail.com");
        u2.displayInfo();

        // Password rỗng ngay từ đầu (bị chặn -> password sẽ null vì chưa có giá trị cũ để giữ)
        User u3 = new User(3, "minh789", "   ", "minh@gmail.com");
        u3.displayInfo();

        // Test đổi dữ liệu sau khi đã có giá trị đúng
        System.out.println("Test đổi email sai và password rỗng cho u1:");
        u1.setEmail("sai-email");
        u1.setPassword("");
        u1.displayInfo(); // u1 vẫn giữ email/password cũ
    }
}