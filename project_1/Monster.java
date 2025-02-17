package project_1;

public class Monster {

    String type;
    int hitPoints;
    int attackRating;
    int xpValue;
    int goldValue;

    public Monster(String type, int hp, int attackR, int xp, int gold) {
        this.type = type;
        this.hitPoints = hp;
        this.attackRating = attackR;
        this.xpValue = xp;
        this.goldValue = gold;
    }

    public Monster() {
        this.type = "goblin";
        this.hitPoints = 10;
        this.attackRating = 1;
        this.xpValue = 1;
        this.goldValue = 1;
    }

    public boolean isDefeated() {
        return this.hitPoints <= 0;
    }

    public void receiveAttack(int incAttack) {
        this.hitPoints = Math.max(0, this.hitPoints - incAttack);
    }

    public int getAttackRating() {
        return this.attackRating;
    }

    public String getMonsterType() {
        return this.type;
    }

    public int getXpValue() {
        return this.xpValue;
    }

    public int getGoldValue() {
        return this.goldValue;
    }

    public static void main(String[] args) {
    }
}