package day3;

public class Driver {
    public static void main(String[] args) {
        
       Dog myDog= new Dog("Rocky", "Labrador", 5);
       myDog.bark(3);

            Owner owner1 = new Owner("Emily", myDog);
            owner1.walkDog (20);
            owner1.feedDog ("chicken");

             myDog.sleep (8);
             owner1.printDogAge ();

        
        Dog secondDog= new Dog("Luna", "Poodle", 7);
        secondDog.bark(2);

            Owner secondOwner = new Owner("David", secondDog);
            secondOwner.walkDog (15);
            secondOwner.feedDog ("beef");
            secondOwner.printDogAge ();

        myDog.sleep (6);
        secondDog.sleep (7);

        








    }
}
