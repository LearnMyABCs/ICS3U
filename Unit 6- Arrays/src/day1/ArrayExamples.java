

    package day1;
   
     public class ArrayExamples {
        public static void main(String[] args) {
            //exampleOne();
            //exampleTwo();
            exampleThree();
        }

        private static void exampleThree(){
            int nums = new int[10]; //creates a new int array of length 10 that stores 0 by default

            for (int i =0; i< nums.length; i++){
                nums [i] = (int)(Math.random()*100)+1
            }

            for (int el:nums){
                
            }
        }
     
        private static void exampleTwo(){
            int [] nums = {6,5,4,2,1, -1, 9, 3};
            for (int nextInt: nums){    //iterates left to right in the array and makes a copy of the next element and stores in nextInt
            System.out.println(nextInt);
            }
        }
       
     
     
       
     
           
           
            int [] nums = {6,5,4,2,1, -1, 9, 3};
     
                System.out.println(nums.length);//prints length of the harray
            for (int i = 0; i< nums.length; i++){   //iterates through the array
                System.out.println(nums[i]);    //prints the elements in the aray
            }
        }
     
     
     
    }
     
}
