package day2;

public class IfElseStatements {
    public static void main(String[] args) {
        int num = 129487;

        if(num % 2 ==0)
            System.out.println(num + "is even");

        else 
            System.out.println(num + "is odd"); //else means the condition above was not true
                                                //the if above did not evaluate
                                                //else must be part of an if statement
    }
}
