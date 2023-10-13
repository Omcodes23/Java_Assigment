// Main.java
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Poodle poodle = new Poodle();

        // Calling the makeSound() method on each object
        animal.makeSound(); // Output: Animal makes a sound.
        dog.makeSound();    // Output: Dog barks.
        poodle.makeSound(); // Output: Poodle barks softly.
    }
}
