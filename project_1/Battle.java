package project_1;

public class Battle {
    public static String fight(Hero h, Monster m) {
        while (h.hasHPRemaining() && !m.isDefeated()) {
            // Hero attacks the monster
            m.receiveAttack(h.getAttackRating());
            
            // If the monster is defeated, exit loop
            if (m.isDefeated()) {
                break;
            }
            
            // Monster attacks the hero
            h.receiveAttack(m.getAttackRating());
            
            // If hero is out of HP, attempt to use a healing potion
            if (!h.hasHPRemaining()) {
                h.useHealingPotion();
            }
        }

        // Determine battle outcome
        if (!h.hasHPRemaining()) {
            return "The " + m.getMonsterType() + " has defeated " + h.getHeroName() + ". Game over.";
        } else {

            int prevXP = h.getCurrentXP();

            h.receiveXP(m.getXpValue());
            h.increaseHealingPotions(m.getGoldValue() / 3);
            return h.getHeroName() + " has defeated the " + m.getMonsterType() + " earning " + 
                   m.getGoldValue() + " gold and " + m.getXpValue() + " XP leveling up " + 
                   ((m.xpValue + prevXP) / 10) + " times.";
        }
    }

    public static void main(String[] args) {
        Monster mon = new Monster("goblin", 1, 1, 1, 1); // Default monster is a goblin
        Hero brb = new Hero("Barb the barbarian", 100, 10, 10, 10);
        String fightResult = Battle.fight(brb, mon);
        System.out.println(fightResult);
        
        Monster newmon = new Monster("goblin", 1, 1, 29, 1); // Default monster is a goblin
        String fightResult_two = Battle.fight(brb, newmon);
        System.out.println(fightResult_two);
    }
}
