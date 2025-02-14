package project_1;

public class Hero {

    String heroName;
    int hitPointsRemaining;
    int hitPointsMax;
    int attackRating;
    int defenseRating;
    int currentXP;
    int currentLevel;
    int healingPotions;
    
    public Hero(String name, int hpMax, int ar, int dr, int potions) {
        this.heroName = name;
        this.hitPointsMax = hpMax;
        this.attackRating = ar;
        this.defenseRating = dr;
        this.healingPotions = potions;

        this.hitPointsRemaining = hpMax;
        this.currentXP = 0;
        this.currentLevel = 1;
    }

    public boolean hasHPRemaining() {
        return this.hitPointsRemaining > 0 ? true : false;
    }

    public void receiveAttack(int incAttack) {
        int damage = incAttack - this.defenseRating;
        if(damage < 0) {
            damage = 0;
        }
        this.hitPointsRemaining -= damage;
        if(this.hitPointsRemaining <= 0) {
            this.hitPointsRemaining = 0;
        }
    }

    public void receiveXP(int xpReceived) {
        this.currentXP += xpReceived;
        int levelsGained = this.currentXP / 10;
        this.currentLevel += levelsGained;
        this.hitPointsMax += levelsGained * 5;
        this.hitPointsRemaining = this.hitPointsMax;
    
    }

    public void useHealingPotion() {
        if(this.healingPotions > 0) {
            this.hitPointsRemaining = this.hitPointsMax;
            this.healingPotions--;
        }
    }
}
