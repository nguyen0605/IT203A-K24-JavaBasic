public class Main {

    public static void main(String[] args) {

        Drink[] drinks = new Drink[3];

        drinks[0] = new Coffee("D01", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice("D02", "Nước cam", 40000, 10);
        drinks[2] = null;

        for (Drink d : drinks) {

            if (d != null) {

                d.displayInfo();

                System.out.println("Thành tiền: " + d.calculatePrice());

                if (d instanceof IMixable) {
                    ((IMixable) d).mix();
                }

                System.out.println("------------------");
            }
        }
    }
}