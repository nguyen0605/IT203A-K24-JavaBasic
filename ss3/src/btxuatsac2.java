import java.util.Arrays;
public class btxuatsac2 {

    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[a.length + b.length];
        int last = Integer.MIN_VALUE;

        while (i < a.length && j < b.length) {
            int pick;

            if (a[i] < b[j]) {
                pick = a[i++];
            } else if (a[i] > b[j]) {
                pick = b[j++];
            } else {
                pick = a[i];
                i++;
                j++;
            }

            if (pick != last) {
                temp[k++] = pick;
                last = pick;
            }
        }

        while (i < a.length) {
            int pick = a[i++];
            if (pick != last) {
                temp[k++] = pick;
                last = pick;
            }
        }

        while (j < b.length) {
            int pick = b[j++];
            if (pick != last) {
                temp[k++] = pick;
                last = pick;
            }
        }

        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {
        int[] arrayFirst  = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.println("Kho cũ:  " + Arrays.toString(arrayFirst));
        System.out.println("Lô mới:  " + Arrays.toString(arraySecond));
        System.out.println("Kho tổng (đã gộp & lọc trùng): " + Arrays.toString(arrayMerge));
    }
}
