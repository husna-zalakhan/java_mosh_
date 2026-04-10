package practices.java_mosh_;

public class Bicycle {

    protected int gear;
    protected int speed;

    //constructor where i initializing the starting speed and starting gear. 
    public Bicycle (int startSpeed, int startGear){
        gear = startGear;
        speed = startSpeed;
    }

    public void setGear (int newValue){
        gear = newValue;
    }

    public void applyBrake (int decrement){
        speed -= decrement; 
    }

    public void speedUp (int increment){
        speed += increment;
    }


    
}
