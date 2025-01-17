package day8;

public class TestQuestionTwoB {
    public static void main(String[] args) {
       
        Member john = new Member ("John Doe",101);
       
        Trainer sarah = new Trainer ("Sarah Lee", 5);
      
        WorkoutPlan strengthTraining = sarah.createWorkoutPlan("Strength Training");
        
        sarah.assignWorkoutPlan(john,strengthTraining);

        WorkoutPlan johnsPlan = john.getWorkOutPlan();

        System.out.println(johnsPlan.getPlanName() + "," + johnsPlan.getDifficulty());

        john.cancelWorkoutPlan();

        WorkoutPlan cardioEndurance = sarah.createWorkoutPlan("Cardio Endurance");

        john.assignWorkoutPlan (john, cardioEndurance);

        System.out.println(johnsPlan.getPlanName() + "," + johnsPlan.getDifficulty());

        cardioEndurance.setDifficulty("hard");

        System.out.println(johnsPlan.getPlanName() + "," + johnsPlan.getDifficulty());

        WorkoutPlan yogaFlexibility = sarah.createWorkoutPlan ("Yoga Flexibility");

        john.changeWorkoutPlan (yogaFlexibility);

        johnsPlan = john.getWorkOutPlan();

        System.out.println(johnsPlan.getPlanName() + "," + johnsPlan.getDifficulty());


    }
}
