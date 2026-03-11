public class Mage extends GameCharacter implements ISkill {

    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {

        int damage;

        if(mana >= 5){
            damage = attackPower;
            mana -= 5;
            System.out.println("[Pháp sư] " + name + " tung phép!");
        } else {
            damage = attackPower / 2;
            System.out.println(name + " hết mana, đánh yếu!");
        }

        target.takeDamage(damage);
    }

    @Override
    public void useUltimate(GameCharacter target) {

        if(mana >= 50){

            System.out.println(name + " tung chiêu 'Hỏa cầu'!");

            mana -= 50;

            int damage = attackPower * 3;

            target.takeDamage(damage);

            System.out.println(name + " tốn 50 mana. Mana còn: " + mana);

        } else {
            System.out.println(name + " không đủ mana để dùng chiêu cuối!");
        }

    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Mana: " + mana);
    }
}