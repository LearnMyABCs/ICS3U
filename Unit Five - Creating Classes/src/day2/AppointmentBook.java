package day2;

public class AppointmentBook {
    public int findFreeBlock (int period, int duration){
        int count = 0;
        for (int i = 0, i < 60, i++){
            if (isMinuteFree(period,minute)){
                count ++
                if (count == duration){
                    return minute - count + 1

                }
                else{
                    count = 0; 
                }
                return -1;
            }
        }
    }

    public boolean makeAppointment (int startPeriod, int endPeriod, int duration){
        for (int i=startPeriod; i<= endPeriod; i++ ){
            if (findFreeBlock(int period, int duration)!=-1){
                reserveBlock(period, minute, duration);
                return true;
            }
        }
        return false; 
    }

}
