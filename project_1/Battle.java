package project_1;

public class Battle {
    public static String fight(Hero h, Monster m) {
        while(h.hasHPRemaining() && !m.isDefeated()) {
            m.receiveAttack(h.attackRating);
            h.receiveAttack(m.attackRating);
            if(!h.hasHPRemaining()) {
                h.useHealingPotion();
            }
        }
        if(!h.hasHPRemaining()) {
            return "The " + m.monsterType + " has defeated " + h.heroName + ". Game over.";
        }
        else {
            h.receiveXP(m.xpValue);
            h.healingPotions += m.goldValue / 3;
            return h.heroName + " has defeated the " + m.monsterType + " earning " + m.goldValue + " gold and " + m.xpValue + " XP leveling up " + (h.currentXP / 10) + " times.";
        }
    }

    public static void main(String[] args) {
           
    }
}
