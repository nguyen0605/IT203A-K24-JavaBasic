import java.util.HashSet;
import java.util.Set;

public class btgioi1 {
    public static void main(String[] args) {
        Set<String> drugIngredients = new HashSet<>();
        drugIngredients.add("Aspirin");
        drugIngredients.add("Caffeine");
        drugIngredients.add("Paracetamol");

        Set<String> allergies = new HashSet<>();
        allergies.add("Penicillin");
        allergies.add("Aspirin");

        Set<String> intersection = new HashSet<>(drugIngredients);
        intersection.retainAll(allergies);

        Set<String> safeIngredients = new HashSet<>(drugIngredients);
        safeIngredients.removeAll(allergies);

        System.out.println("Thuốc: " + drugIngredients);
        System.out.println("Dị ứng: " + allergies);

        System.out.println("Cảnh báo dị ứng: " + intersection);
        System.out.println("Thành phần an toàn: " + safeIngredients);
    }
}
