import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class btkha2 {
    public static List<String> removeDuplicateAndSort(List<String> list){
        List<String> result = new ArrayList<>();

        for (String implement : list){
            if (!result.contains(implement)){
                result.add(implement);
            }
        }

        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        List<String> medicines = new ArrayList<>();

        medicines.add("Paracetamol");
        medicines.add("Ibuprofen");
        medicines.add("Panadol");
        medicines.add("Paracetamol");
        medicines.add("Aspirin");
        medicines.add("Ibuprofen");

        List<String> result = removeDuplicateAndSort(medicines);

        System.out.println(result);
    }
}
