package project_1;

public class Monster {

    String monsterType;
    int healthPoints;
    int attackRating;
    int xpValue;
    int goldValue;

    public Monster(String type, int hp, int attackR, int xp, int gold) {
        this.monsterType = type;
        this.healthPoints = hp;
        this.attackRating = attackR;
        this.xpValue = xp;
        this.goldValue = gold;
    }

    public Monster() {
        this.monsterType = "Goblin";
        this.healthPoints = 10;
        this.attackRating = 1;
        this.xpValue = 1;
        this.goldValue = 1;
    }

    public boolean isDefeated () {
        if(this.healthPoints <= 0) {
            return true;
        }
        return false;
    }

    public void receiveAttack(int incAttack) {
        this.healthPoints -= incAttack;
    }


    public static void main(String[] args) {
        
    }
}
