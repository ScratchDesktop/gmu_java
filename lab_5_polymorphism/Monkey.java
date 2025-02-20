package lab_5_polymorphism;

public class Monkey extends Animal {
    
    public Monkey(String Name) {
        super(Name, "Monkey", false);
    }

    @Override
    public void printFeed() {
        System.out.println("You give this monkey some bananas.");
    }

    public void printClimb() {
        System.out.println("This monkey climbs a tree!");
    }
}
