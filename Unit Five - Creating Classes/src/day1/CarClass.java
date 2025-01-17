public class CarClass {
    private String make;
    private String model;
    private int year;
    private double mileage;
      
public Car(String make, String model, int year, double mileage){
    this.make = make;
    this.model = model; 
    this.year = year;
    this.mileage = mileage;
    }
    
public String Getter(){
    return make;
}

public void Setter (String newMake){
    make = newMake;
}

public void displayCarDetails(){
    System.out.println(make);
    System.out.println(model);
    System.out.println(year);
    System.out.println(mileage);

}
public void drive(double milesDriven){
    mileage += milesDriven;
    System.out.println(mileage);
}

}
