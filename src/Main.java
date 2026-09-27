import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Cat myCat = new Cat("Black", "Ball", 4);
        Dog myDog = new Dog("Terrier", "Buddy", 3);
        Frog myFrog = new Frog("Green", "Froggy", 2);
        myCat.speak();
        myDog.speak();
        myCat.scratch();
        myDog.fetch();
        myFrog.speak();
        myFrog.jump();

        // Part C:

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("ef","Friend",3));
        animals.add(new Dog("e","Buddy",4));
        animals.add(new Frog("ef","Froggy",2));
        animals.add(new Cat("edf","Whiskers",5));
        animals.add(new Dog("e","Max",6));
        // I guess the output will be cat meow, dog bark, frog ribbit,cat meow, dog bark.
        for (Animal animal : animals) 
            animal.speak();
        
        // Part D:
        Animal animal = new Dog("Labrador", "Rex", 5);
        animal.speak(); // Output: Rex says Woof!
        //animal.fetch(); The reference type is animal, the actual object type is Dog,
        // so the method fetch() is not accessible through the reference type Animal.

        //PART E:
        Dog dog = new Dog("Beagle", "Wells", 3);
        Animal animal1 = dog; // Upcasting Dog to Animal
        animal1.speak();

        
} 

    /*
    PART B: 

    1:
    For the Var reference types a1 type is animal and var is DOG
    Similar for other two just different class names for the var.

    2:
    Essentially, Even though they all reference Animal, the
    classes contain an override method for speak() and the 
    correct method is called based on the actual object type (Dog, Cat, Frog) at runtime.
    */

    //PART C:
    
}