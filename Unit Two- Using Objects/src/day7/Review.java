package day7;

public class Review {

   public static void main(String[] args) 
   {
    
    String apple = "apple";
    int index = apple.indexOf("p");

    System.out.println("First occurence of 'p' is at index" + index);

    String banana = "banana";
    String banSub= banana.substring(0,(banana.length()+1)/2+1);
    System.out.println(banSub);

    String apple1 = "apple";
    String apple2 = "apple";

    System.out.println("Are the two strings equal? " + (apple1.equals(apple2)));

    String watermelon = "watermelon";
    String waterSub = watermelon.substring(0, 5);

    System.out.println(waterSub);

    String banana1 = new String ("banana");
    int bananaIndex = banana1.indexOf("a");
    System.out.println(bananaIndex);

    String random = "poopydookie";

    int index1 = (int)(Math.random()* random.length());
   
    String newIndex =  random.substring(0, index1) + random.substring(index1+1 );

    System.out.println(newIndex);

      
      String story = "Today I ate a cookie";

      int indexS = (int) Math.random()*story.length();

      String word = story.substring(indexS, (indexS+3));

      System.out.println(word);

      double a = 3.5;
      double b = 6.9;

      double hypoteneuse = Math.sqrt (Math.pow(a, 2) + Math.pow (b,2));

      System.out.println(hypoteneuse);

      int minimum = 2;

      int maximum = 18;

      int minMax = (int) (Math.random()*17) + 2;

      System.out.println(minMax);

   
   }
}
