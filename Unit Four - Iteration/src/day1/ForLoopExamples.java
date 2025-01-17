package day1;

public class ForLoopExamples {
    public static void main(String[] args) {
        
    
   
   //print -10, -18, -6, -4, -2, 0, 2 4 
   //no if statements allowed
   
    // for (int i = -10; i < 5; i += 2){
    //     System.out.println(i);
    //}

    // for (int i = 1000; i>-1001; i--){
    //     System.out.println(i);
    // }   

    // int sum = 0
    // for (int i = 1; i < 1001 ; i++){
    //     sum += i;
    // }

    // System.out.println(sum);


    // String str = "Alphabet Soup";
    // for (int index = str.length()-1; index >=0; index--){
    //     System.out.println(str.substring(index, index +1));
    // }

    //count the number of vowels
    String str = "Alphabet Soup";
    int numVowels = 0;
    for (int i = 0; i < str.length(); i++) {
        String letter = str.substring(i, i+1);

        if("aeiouAEIOU".indexOf(letter)>=0){
            numVowels++;
        }
        System.out.println(numVowels);
        
    }

    System.out.println(numVowels);
       

    }}