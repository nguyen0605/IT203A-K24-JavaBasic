import java.util.ArrayList;
import java.util.List;

public class btgioi1 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB){
        List<T> result = new ArrayList<>();

        for (T item : listA){
            if (listB.contains(item) && !result.contains(item)){
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        listA.add(101);
        listA.add(102);
        listA.add(105);

        List<Integer> listB = new ArrayList<>();
        listB.add(102);
        listB.add(105);
        listB.add(108);

        System.out.println(findCommonPatients(listA, listB));

        // Test với String
        List<String> listA2 = new ArrayList<>();
        listA2.add("DN01");
        listA2.add("DN02");
        listA2.add("DN03");

        List<String> listB2 = new ArrayList<>();
        listB2.add("DN02");
        listB2.add("DN04");

        System.out.println(findCommonPatients(listA2, listB2));
    }
}
