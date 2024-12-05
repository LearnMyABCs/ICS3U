package day4;

public class ExampleFour {public static void main(String[] args) {
    
    int totalSeconds = 7262;

    int hours = totalSeconds / 3600;

    int minutes = totalSeconds / 60%60;

    int seconds = totalSeconds % 60;

        System.out.println(hours + " " + minutes + " " + seconds );

}
}
