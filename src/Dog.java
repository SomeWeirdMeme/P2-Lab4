public class Dog extends Animal {
    private String breed;

    public Dog(String breed, String name, int age) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball!");
    }
}