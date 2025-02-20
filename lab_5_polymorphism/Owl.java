package lab_5_polymorphism;

public class Owl extends Animal {
    public Owl(String Name) {
        super(Name, "Owl", true);
    }

    @Override
    public void printFeed() {
        System.out.println("You give this owl some mice.");
    }

    @Override
    public void printRoam() {
        System.out.println("This owl flies around.");
    }
}
