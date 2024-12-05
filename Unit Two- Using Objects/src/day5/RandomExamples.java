package day5;

public class RandomExamples {

        
    public static void main(String[] args) {
       // for (int i = 0; i < 1000; i++) {
         //       System.out.println(Math.random());
        //}
   // }

   
   //generate a number from 1-10 inclusive -> integers only 
   int num1 = (int) (Math.random()*10) + 1;

   //generate a number from -10 to 10  inclusive -> integers only

   int num2 = (int) (Math.random()*21) + -10;

   int min = 8;
   int max = 123;

   //gnerate a number from min to max inclusive-> ints only


   int num3 = (int) (Math.random()* (max - min+1)) + min;



