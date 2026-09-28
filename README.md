## Getting Started

I write my answer to the questions in side my main class.

# DONE BY ANTHONY O'Sullivan


## Final Ai practice done On readme

ArrayList<Animal> animals = new ArrayList<>();

animals.add(new Dog("Buddy"));
animals.add(new Cat("Mittens"));
animals.add(new Frog("Kermit"));

for (Animal animal : animals) {
    animal.speak();
}

Is the original and when I asked to make the unsafe downcast it gave me this.

Animal a = animals.get(0);
cat badCat = (Cat) a;
badCat.scratch():

Well as per usual it will throw a class exception and it does as I test since the index 0 is dog and not a CAT meaning actual obj type is DOG since its first in the list. Its unsafe cause downcast is forced for cat but it points to dog.

# Its repaired with...
 Animal a = animals.get(0);

 if(a instanceof Cat){
    Cat cat = (Cat) a ;
    cat.scratch();
 } else {
    System.out.println("No cat")
 }
 Essentially it properly uses instance of to refer to the cat and i added a fallback if the actual object type isn't recognized as cat.

With many instance of it will make it fragile and hard to maintain and polymorphism makes it much easier with overriding so no need to see object types no need for the if elses.