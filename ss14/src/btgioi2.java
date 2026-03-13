import java.util.*;

public class btgioi2 {
    public static void main(String[] args) {
        List<String> diseases = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );

        Map<String, Integer> countMap = new HashMap<>();

        for (String disease : diseases){
            if (countMap.containsKey(disease)){
                countMap.put(disease, countMap.get(disease) + 1);
            } else {
                countMap.put(disease,1);
            }
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(countMap);

        for (Map.Entry<String,Integer> entry : sortedMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
