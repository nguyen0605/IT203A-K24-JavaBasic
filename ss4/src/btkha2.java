public class btkha2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, Tình trạng mới";

        if (description.contains("Kệ:")){
            int start = description.indexOf("Kệ:") + 4;

            if (description.charAt(start) == ' '){
                start++;
            }

            int end = description.indexOf(",",start);

            if (end == -1){
                end = description.length();
            }

            String location = description.substring(start,end);

            System.out.println("Vị trí tìm thấy: "+location);

            String newDescription = description.replace("Kệ","Vị trí lưu trữ");

            System.out.println("Mô tả mới: "+newDescription);
        } else {
            System.out.println("không tìm thấy vị trí kệ!");
        }
    }
}
