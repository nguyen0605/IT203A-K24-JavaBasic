import java.lang.reflect.Array;
import java.util.Arrays;

public class btgioi2 {
    public static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {105,102,109,101,103};

        System.out.println("Trước khi sắp xếp: " + Arrays.toString(arr));

        sortBooks(arr);

        System.out.println("Sau khi sắp xếp: " +Arrays.toString(arr));
    }
}
