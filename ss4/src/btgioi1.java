import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class btgioi1 {
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};

        int repeat = 20000;

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yy");
        String today = LocalDate.now().format(fmt);

        String header = "--- BÁO CÁO MƯỢN SÁCH ---\n" + "Ngày tạo: " + today + "\n";

        // ====== ĐO THỜI GIAN: StringBuilder ======
        long startSB = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        sb.append(header);

        for (int r = 0; r < repeat; r++) {
            for (String t : transactions) {
                sb.append("Giao dịch: ").append(t).append("\n");
            }
        }

        String reportSB = sb.toString();
        long endSB = System.nanoTime();
        long timeSB = endSB - startSB;

        // ====== ĐO THỜI GIAN: String nối bằng + ======
        long startStr = System.nanoTime();

        String reportStr = header;
        for (int r = 0; r < repeat; r++) {
            for (String t : transactions) {
                reportStr = reportStr + "Giao dịch: " + t + "\n";
            }
        }

        long endStr = System.nanoTime();
        long timeStr = endStr - startStr;

        // 3) In báo cáo (in bản StringBuilder cho đúng yêu cầu chính)
        System.out.println(reportSB);

        // 4) In so sánh thời gian (đổi ra ms cho dễ nhìn)
        System.out.println("Số thời gian thực thi đối với StringBuilder (ms): " + (timeSB / 1_000_000.0));
        System.out.println("Số thời gian thực thi đối với String (ms): " + (timeStr / 1_000_000.0));
    }
}
