class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;

    public void registerPerson(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        this.name = name;
        this.age = age;
        System.out.println("Registration successful!");
    }
}

public class CustomException {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.registerPerson("John", 14);
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
