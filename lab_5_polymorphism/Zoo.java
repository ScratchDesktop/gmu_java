package lab_5_polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic", "Animal", false);
        genericAnimal.printInfo();
        genericAnimal.printSleepInfo();
        genericAnimal.printRoam();
        genericAnimal.printFeed();

        Owl owl = new Owl("Ollie");
        owl.printInfo();
        owl.printSleepInfo();
        owl.printRoam();
        owl.printFeed();

        Monkey monkey = new Monkey("Mike");
        monkey.printInfo();
        monkey.printSleepInfo();
        monkey.printRoam();
        monkey.printFeed();
        monkey.printClimb();
    }
}
