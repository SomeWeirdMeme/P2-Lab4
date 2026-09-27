public class Cat extends Animal

{
    private String color;

    public  Cat(String color, String name, int age){
        super (name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says Meow!");
    }
    
    public void scratch(){
        System.out.println(getName() + " is scratching stuff");
    }
}
