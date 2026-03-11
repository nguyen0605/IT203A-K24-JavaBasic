public abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int attackPower;

    public static int count;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public static int getCount() {
        return count;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public static void setCount(int count) {
        GameCharacter.count = count;
    }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int amount){
        hp -= amount;

        if (hp <= 0){
            System.out.println("Đã bị hạ gục");
        } else {
            System.out.println("Đã mất " + amount + ", còn lại: " + hp + " hp");
        }
    }

    public void displayInfo(){
        System.out.println("Tên: " + name + " | HP: " + hp + " | Attack: " + attackPower);
    }
}
