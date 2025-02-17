package project_1;

/*
* Names: Donald Knuth
* netID: dknuth
* G#: 00123456
* Lecture section: 004
* Lab section: 213
*/

public class Hero {

    String name;
    int hitPointsRemaining;
    int hitPointsMax;
    int attackRating;
    int defenseRating;
    int currentXP;
    int currentLevel;
    int healingPotions;
    
    public Hero(String name, int hpMax, int ar, int dr, int potions) {
        this.name = name;
        this.hitPointsMax = hpMax;
        this.attackRating = ar;
        this.defenseRating = dr;
        this.healingPotions = potions;

        this.hitPointsRemaining = hpMax;
        this.currentXP = 0;
        this.currentLevel = 1;
    }

    public boolean hasHPRemaining() {
        return this.hitPointsRemaining > 0;
    }

    public void receiveAttack(int incAttack) {
        int damage = Math.max(0, incAttack - this.defenseRating);
        this.hitPointsRemaining = Math.max(0, this.hitPointsRemaining - damage);
    }

    public void receiveXP(int xpReceived) {
        this.currentXP += xpReceived;
        int levelsGained = this.currentXP / 10;
        this.currentLevel += levelsGained;
        this.hitPointsMax += levelsGained * 5;
        this.hitPointsRemaining = this.hitPointsMax;
        this.currentXP %= 10; // Reset XP after leveling up
    }
    
    public int getLevelsGained() {
        return this.currentXP / 10;
    }

    public void useHealingPotion() {
        if (this.healingPotions > 0) {
            this.hitPointsRemaining = this.hitPointsMax;
            this.healingPotions--;
        }
    }

    public int getAttackRating() {
        return this.attackRating;
    }

    public String getHeroName() {
        return this.name;
    }

    public int getCurrentXP() {
        return this.currentXP;
    }

    public void increaseHealingPotions(int amount) {
        this.healingPotions += amount;
    }
}