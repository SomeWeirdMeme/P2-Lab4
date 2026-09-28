import java.util.ArrayList;

public class PolymorphismLab {
    public static void main(String[] args) {
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
        animals.add(new Cat("ef", "Friend", 3));
        animals.add(new Dog("e", "Buddy", 4));
        animals.add(new Frog("ef", "Froggy", 2));
        animals.add(new Cat("edf", "Whiskers", 5));
        animals.add(new Dog("e", "Max", 6));
        // I guess the output will be cat meow, dog bark, frog ribbit,cat meow, dog
        // bark.
         for (Animal animal : animals)
             animal.speak();
        // TESTING PART J: 
        System.out.println("Testing makeAllAnimalsSpeak method:"); 
        makeAllAnimalsSpeak(animals);

        // Part D:
        Animal animal = new Dog("Labrador", "Rex", 5);
        animal.speak(); // Output: Rex says Woof!
        // animal.fetch(); The reference type is animal, the actual object type is Dog,
        // so the method fetch() is not accessible through the reference type Animal.

        // PART E:
        Dog dog = new Dog("Beagle", "Wells", 3);
        Animal animal1 = dog; // Upcasting Dog to Animal
        // There is one Object created in memory, the reference type is Animal,
        // the actual object type is Dog. Yes they refer to the same object.
        animal1.speak();

        // PART F:
        Animal animal2 = new Dog("jef", "ej", 3);
        // animal2.fetch(); // This line will cause a compilation error because the
        // reference type is Animal,
        // which does not have a fetch() method.
        // Part 2:
        Dog dog2 = (Dog) animal2;
        dog2.fetch();

        // Part 2:
        // The downcast is correct cause the object stored in animal2 is actually a Dog
        // object.
        // So it lets use use class specific methods like fetch that aren't possible
        // with Animal

        // Part G:
        Animal first = new Dog("Labrador", "Rex", 5);
        Animal second = new Cat("Black", "Whiskers", 3);

        if (first instanceof Dog) {
            Dog dog3 = (Dog) first;
            dog3.fetch();
        }

        if(second instanceof Cat){
            Cat cat = (Cat) second;
            cat.scratch();
        }

        if (second instanceof Dog) {
            Dog dog4 = (Dog) second;
            dog4.fetch();
        }

        // instanceof checks the actual object type, not just the reference type.
        // second refers to a Cat, so the Dog check is false and its cast is skipped.

        // Part H:
        // Animal animal6 = new Cat("e", "dw", 2);
        // Dog dog6 = (Dog) animal6;
        // dog6.fetch();

        // This will throw a ClassCastException at runtime because animal6 is actually a
        // Cat object,
        // and you cannot cast a Cat to a Dog.

        makeAnimalSpeak(new Dog("Buddy", "b", 5));
        makeAnimalSpeak(new Cat("Mittens", "wv", 2));
        makeAnimalSpeak(new Frog("Kermit", "k", 3));

    }
    /*
     * PART B:
     * 
     * 1:
     * For the Var reference types a1 type is animal and var is DOG
     * Similar for other two just different class names for the var.
     * 
     * 2:
     * Essentially, Even though they all reference Animal, the
     * classes contain an override method for speak() and the
     * correct method is called based on the actual object type (Dog, Cat, Frog) at
     * runtime.
     */

    // Part I:
    public static void makeAnimalSpeak(Animal animal) {
        animal.speak();
    }
    // Well the reference type is Animal, but the actual object type is Dog, Cat, or Frog.
    // However since the reference is Animal and they all are children of animal they inherit its properties.
    // Its upcasted to Animal so it can be passed to the method. The method will call the correct speak() method based on the object type.
    // But since each one has its own override of speak they output their own sounds instead of the Animal class speak.

    // Part J:
    public static void makeAllAnimalsSpeak(ArrayList<Animal> animals){
        for(Animal animal : animals){
            animal.speak();
        }
        //This is inherently better because it can reference outside this class,
        // Puts them all in one place and makes it easier to call the method with different animals.
        //No duplications
        // New bird class as long as it extends animal there are no changes needed.
    }
}