package lab_5_polymorphism;

public class Animal {
    private String name;
    private String type;
    private boolean nocturnal; 

    public Animal(String name, String type, boolean nocturnal) {
        this.name = name;
        this.type = type;
        this.nocturnal = nocturnal;
    }
    public void printInfo() {
        System.out.println(name + " is a(n) " + type + ".");
    }

    public void printSleepInfo() {
        if (nocturnal) {
            System.out.println(type + "s sleep during day.");
        } else {
            System.out.println(type + "s sleep during night.");
        }
    }

    public void printRoam() {
        System.out.println(name + " walks around.");
    }

    public void printFeed() {
        System.out.println("Chomp chomp");
    }

}
