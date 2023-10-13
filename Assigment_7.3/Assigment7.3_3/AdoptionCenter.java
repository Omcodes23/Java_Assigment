// AdoptionCenter.java
public class AdoptionCenter {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, true);

        System.out.println("Dog details:");
        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        System.out.println("Breed: " + dog.getBreed());

        System.out.println("\nCat details:");
        System.out.println("Name: " + cat.name);
        System.out.println("Age: " + cat.age);
        System.out.println("Indoor Cat: " + cat.isIndoor());

        System.out.println("\nAnimal Sounds:");
        System.out.print("Dog: ");
        dog.makeSound();
        System.out.print("Cat: ");
        cat.makeSound();
    }
}
