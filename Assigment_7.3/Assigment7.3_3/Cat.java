// Cat.java
class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows gracefully.");
    }

    public boolean isIndoor() {
        return isIndoor;
    }
}