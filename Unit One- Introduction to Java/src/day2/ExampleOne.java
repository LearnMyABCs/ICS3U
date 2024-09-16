package day2;

public class ExampleOne {
    public static void main(String[] args) {
        //add the digits from a four digit number

        int num = 1234;

        int digit1 = num / 1000; 
        int digit2 = num / 100 % 10; // 1234 / 100 = 12, 12 % 10 = 2
        int digit3 = num /10 % 10;  // 1234 / 10 = 123, 123 % 10 = 3
        int digit4 = num % 10;

       System.out.println(digit1 + digit2 + digit3 + digit4);

       //prints out 1 + 2 + 3 + 4
    }
}
