import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class btgioi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào mã thẻ: ");
        String cardID = sc.nextLine();

        if (cardID.length() != 11){
            System.out.println("Độ dài phải là 11 ký tự!");
            return;
        }

        if (!cardID.startsWith("TV")){
            System.out.println("Thiếu tiền tố TV");
            return;
        }

        String yearPart = cardID.substring(2, 6);
        Pattern yearPattern = Pattern.compile("\\d{4}");
        Matcher yearMatcher = yearPattern.matcher(yearPart);
        int year = Integer.parseInt(yearPart);
        int currentYear = LocalDate.now().getYear();

        if (!yearMatcher.matches()) {
            System.out.println("Năm không hợp lệ (phải là 4 chữ số)");
            return;
        } else if (year < 1900 || year > currentYear){
            System.out.println("Năm không hợp lệ (ngoài phạm vi cho phép)");
            return;
        }

        // 3️⃣ Lấy 5 số cuối
        String lastPart = cardID.substring(6);
        Pattern lastPattern = Pattern.compile("\\d{5}");
        Matcher lastMatcher = lastPattern.matcher(lastPart);

        if (!lastMatcher.matches()) {
            System.out.println("5 ký tự cuối không hợp lệ");
            return;
        }

        System.out.println("Mã thẻ hợp lệ!");
    }
}
