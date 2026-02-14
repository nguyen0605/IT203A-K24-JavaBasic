public class btgioi1 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];

        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max){
                max = quantities[i];
            }
        }

        System.out.println("Sách có số lượng nhiều nhất (50):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max){
                System.out.print("- " + names[i] + "\n");
            }
        }
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];

        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min){
                min = quantities[i];
            }
        }

        System.out.println("\n--------------------");
        System.out.println("Sách có số lượng ít nhất (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {
                "Java Core",
                "Python Pro",
                "Web Design",
                "Data Structure",
                "Machine Learning"
        };

        int[] quantities = {
                20,
                50,
                50,
                5,
                30
        };

        maxQuantityOfBooks(names,quantities);
        minQuantityOfBooks(names,quantities);
    }
}
