public class Warrior extends GameCharacter implements ISkill{
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("Chiến binh " + name + " tấn công " + target.getName() + " !");
        target.takeDamage(attackPower);
    }

    @Override
    public void takeDamage(int amount) {
        int damage = amount - armor;
        if (damage < 0){
            damage = 0;
        }

        System.out.println(name + " giảm " + armor + " sát thương nhờ giáp.");

        super.takeDamage(amount);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println(name + " dùng chiêu 'Đấm ngàn cân'!");

        target.takeDamage(attackPower*2);

        int selfDamage = (int)(hp * 0.1);
        hp -= selfDamage;

        System.out.println(name + " bị mất " + selfDamage + " HP do gắng sức.");
    }
}
