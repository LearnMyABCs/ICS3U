package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        boolean hasRedShoes = true; //boolean types can hold tru or false

        System.out.println(hasRedShoes == false);
        /*hasRedShoes == false is a boolean expression because it 
        evalutes to true or false (a boolean)*/

        int age = 23;

        System.out.println(age >= 18);
        //age >= 18 evalutes to true - it is also a boolean expression

        /*
         * 
         * >=   greater or equal
         * <=   less or equal
         * ==   equal
         * >    greater
         * <    less
         * !=   not equal
         * !    not ex.!true => false
         */

         boolean x = age != 18;
         //x is true because 23 is not equal to 18

         boolean y = !(7>9);
         //y is true => !(false) = true

         boolean z = !!hasRedShoes;

         int a = 7;
         int b = 3;
         boolean test1 = a>6; //true
         boolean test2 = b <=2; //false

         boolean mystery = !test1 ==test2;
    }
}
