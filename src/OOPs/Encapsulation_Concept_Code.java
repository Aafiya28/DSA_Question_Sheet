package OOPs;

//Class Name : "SportsCar" but due to avoid duplicate error in the same folder class name declare : "SportsCarE"
class SportsCarE {

    //Character - variables
    private String brand;
    private String model;
    private boolean isEngineOn;
    private int currentSpeed;
    private int currentGear;

    private String tyre;
    //Constructor
    SportsCarE(String b, String m){
        this.brand = b;
        this.model = m;
        this.isEngineOn = false;
        this.currentSpeed = 0;
        this.currentGear = 0;
    }

    public int getSpeed(){
        return currentSpeed;
    }

    public String getTyre() {
        return tyre;
    }

    public String setTyre(String tyre){
        return this.tyre = tyre;
    }

    //Behaviors - method
    public void startEngine(){
        isEngineOn = true;
        System.out.println("Brand: " + brand + " & Model: " + model + " Engine starts with a roar!");
    }

    public void shiftGear(int gear) {
        if(!isEngineOn){
            System.out.println("Brand: " + brand + " & Model: " + model + " Engine is off! Cannot Shift Gear.");
        }else {
            currentGear = gear;
            System.out.println("Brand: " + brand + " & Model: " + model + " Shifted to Gear: " + currentGear );

        }
    }

    public void accelerate() {
        if(!isEngineOn){
            System.out.println("Brand: " + brand + " & Model: " + model + " Engine is off! Cannot Accelerate.");
        }else {
            currentSpeed += 20;
            System.out.println("Brand: " + brand + " & Model: " + model + " Accelerating to: " + currentSpeed + " km/h");

        }
    }

    public void brake() {
        currentSpeed -= 20;
        if(currentSpeed < 0) {
            currentSpeed = 0;
        }
        System.out.println("Brand: " + brand + " & Model: " + model + " Braking! Speed is now: " + currentSpeed + " km/h");
    }

    public void stopEngine() {
        isEngineOn = false;
        currentGear = 0;
        currentSpeed = 0;
        System.out.println("Brand: " + brand + " & Model: " + model + " Engine turned off.");
    }
}


public class Encapsulation_Concept_Code {

    public static void main(String[] args) {

        SportsCarE myCar = new SportsCarE("Ford", "Mustang");

        myCar.startEngine();
        myCar.shiftGear(1);
        myCar.accelerate();
        myCar.shiftGear(2);
        myCar.accelerate();
        myCar.brake();
        myCar.stopEngine();

        //Setting arbitrary value to speed.
        //mySportsCar.currentSpeed = 500;

        // System.out.println("Current Speed of My Sports Car is set to " + mySportsCar.currentSpeed);

        System.out.println("Current Speed of My Sports Car is " + myCar.getSpeed());
    }
}
