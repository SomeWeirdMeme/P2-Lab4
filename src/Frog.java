public class Frog extends Animal{
    private String kind;

    public Frog(String kind, String name, int age) {
        super(name, age);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says Ribbit!");
    }

    public void jump() {
        System.out.println(getName() + " is jumping around!");
    }
}
