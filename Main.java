public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Luna");

        System.out.println("--- Individual Calls ---");
        myDog.makeSound();
        myCat.makeSound();

        myDog.sleep();
        myCat.sleep();

        System.out.println("\n--- Polymorphic Array ---");
        Animal[] shelter = { myDog, myCat, new Dog("Rocky") };

        for (Animal animal : shelter) {
            animal.makeSound();
        }
    }
}
