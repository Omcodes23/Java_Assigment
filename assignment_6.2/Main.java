class Person {
    private String name;
    private int age;
    private String address;

    // Constructor 
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter name
    public String getName() {
        return name;
    }

    // Getter age
    public int getAge() {
        return age;
    }

    // Getter address
    public String getAddress() {
        return address;
    }

    // Setter address
    public void setAddress(String address) {
        this.address = address;
    }
}

public class Main {
    public static void main(String[] args) {
        // two Person objects
        Person person1 = new Person("Harshul Rathod", 19, "123 Road");
        Person person2 = new Person("Om Vataliya", 50, "450 Road");

        // Print information
        System.out.println("Person 1 Information:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());

        System.out.println("\nPerson 2 Information:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Address: " + person2.getAddress());

        // change the address (person1)
        person1.setAddress("789 Oak St");

        // print updated info (person1)
        System.out.println("\nUpdated Information for Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());
    }
}
