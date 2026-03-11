import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== ARENA OF HEROES ===");

        List<GameCharacter> characters = new ArrayList<>();

        Warrior yasuo = new Warrior("Yasuo", 500, 50, 20);
        Mage veigar = new Mage("Veigar", 300, 40, 200);

        characters.add(yasuo);
        characters.add(veigar);

        // Anonymous class Goblin
        GameCharacter goblin = new GameCharacter("Goblin",100,10) {

            @Override
            public void attack(GameCharacter target) {

                System.out.println("[Quái vật] Goblin cắn trộm " + target.getName() + "...");
                target.takeDamage(10);

            }
        };

        characters.add(goblin);

        System.out.println("Đã khởi tạo " + GameCharacter.count + " nhân vật tham gia đấu trường.\n");

        // Warrior attack Goblin
        yasuo.attack(goblin);

        // Mage ultimate Warrior
        veigar.useUltimate(yasuo);

        // Goblin attack Mage
        goblin.attack(veigar);

        System.out.println("\n=== THÔNG SỐ SAU LƯỢT ĐẤU ===");

        for(GameCharacter c : characters){
            c.displayInfo();
        }

    }
}