package day1;

public class ExampleOne {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lavender", 2, "Golden Retriever", 56.2);

        dog1.bark();    //activate the bark method
        dog1.eat("Chicken");

        Swim swimmer = new Swim();
        swimmer.dive();
    }
}
