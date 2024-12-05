package day2;

public class Driver {
    public static void main(String[] args) 
    {
        Student student1 = new Student("Catherine", 15, "1126804", 3.8, "Law", 2, true);
        Student student2 = new Student("Daisy", 15, "696969", 2.0, "Janitor", 2, true);
         
        String info1 = student1.getInfo(); //returned a String

        System.out.println(info1);

        //System.out.println(student1.age); //age is private and not visible

        student2.study(5);  //study did not return anything


        
    }
    
}
