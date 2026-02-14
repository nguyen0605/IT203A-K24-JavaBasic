import java.util.Scanner;

public class btkha2 {
    public static int searchBooks(String[] arr, String search) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equalsIgnoreCase(search)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] books = {
                "Doraemon",
                "Conan",
                "One Piece",
                "Harry Potter",
                "Clean Code"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int result = searchBooks(books, search);

        if (result == -1){
            System.out.println("Sách không tồn tại trong thư viện");
        } else {
            System.out.println("Tìm thấy sách "+search+" tại vị trí số "+result);
        }
    }
}
