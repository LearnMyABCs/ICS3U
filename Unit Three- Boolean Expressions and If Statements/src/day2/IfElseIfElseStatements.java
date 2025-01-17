package day2;

public class IfElseIfElseStatements {
    public static void main(String[] args) {
        int mark = 76;

        if (mark >=80)
            System.out.println("A");

        else if(mark >= 70)
            System.out.println("B");

        else if(mark >= 60)
            System.out.println("C");

        else if(mark >= 60)
            System.out.println("D");
        
        else
            System.out.println("F");    //else by itself marks the end of the if statement 

        // if you must start iwth (1)
        // else if (0...many)
        // else (0 ...1)
    }
}
