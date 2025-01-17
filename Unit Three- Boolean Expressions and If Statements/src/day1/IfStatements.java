package day1;

public class IfStatements {
    public static void main(String[] args) {
        boolean hasRedShoes = false;

        if (hasRedShoes) {
            System.out.println("You have nice red shoes");
        }

        if (!hasRedShoes) {
            System.out.println("You should buy some red shoes.");

            int x = 73;

            if (x % 2 == 0)
                System.out.println("even");

            if (x % 2 != 0)
                System.out.println("odd");

            if (x > 100)
                System.out.println("Hello");
            System.out.println("Hi...");
        }
    }
}
