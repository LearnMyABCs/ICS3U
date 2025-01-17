package day2;

public class Scoreboard {
private String name1;
private String name2;
private boolean active;
private int teamScore1;
private int teamScore2;

public Scoreboard (String name1, String name2){
    this.name1 = name1;
    this.name2 = name2;
    active = true;
    teamScore1 = 0;
    teamScore2 = 0;
}
public void recordPlay (int numPoints){
    if (points == 0
        
    }
}
public String getScore(){
    if (active == true)
        return (teamScore1 + " - " + teamScore2 + " - " + name1);
    else 
        return (teamScore1 + " - " + teamScore2 + " - " + name2)

}
}
