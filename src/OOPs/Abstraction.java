package OOPs;


interface CarInterface{

    void startEngine();
    void shiftGear(int gear);
    void accelerate();
    void brake();
    void stopEngine();

}

class SportsCar implements CarInterface{

    String brand;
    String model;
    boolean isEngineOn;
    int currentSpeed;
    int currentGear;

    SportsCar(String b, String m){
        this.brand = b;
        this.model = m;
        this.isEngineOn = false;
        this.currentSpeed = 0;
        this.currentGear = 0;
    }

    public void startEngine(){
        isEngineOn = true;
        System.out.println("Brand - " + brand + " & its Model - " + model + " : Engine starts with a roar!");
    }

    @Override
    public void shiftGear(int gear) {
        if(!isEngineOn){
            System.out.println("Brand: " + brand + " & Model: " + model + " : Engine is off! Cannot Shift Gear.");
        }else {
            currentGear = gear;
            System.out.println("Brand: " + brand + " & Model: " + model + " : Shifted to Gear: " + currentGear );

        }
    }

    @Override
    public void accelerate() {
        if(!isEngineOn){
            System.out.println("Brand: " + brand + " & Model: " + model + " : Engine is off! Cannot Accelerate.");
        }else {
            currentSpeed += 20;
            System.out.println("Brand: " + brand + " & Model: " + model + " Accelerating to " + currentSpeed + " km/h");

        }
    }

    @Override
    public void brake() {
        currentSpeed -= 20;
        if(currentSpeed < 0) {
            currentSpeed = 0;
        }
        System.out.println("Brand: " + brand + " & Model: " + model + " Braking! Speed is now: " + currentSpeed + " km/h");
    }

    @Override
    public void stopEngine() {
        isEngineOn = false;
        currentGear = 0;
        currentSpeed = 0;
        System.out.println("Brand: " + brand + " & Model: " + model + " Engine turned off.");
    }
}


public class Abstraction {

    public static void main(String[] args) {

        CarInterface myCar = new SportsCar("Ford", "Mustang");

        myCar.startEngine();
        myCar.shiftGear(1);
        myCar.accelerate();
        myCar.shiftGear(2);
        myCar.accelerate();
        myCar.brake();
        myCar.stopEngine();
    }


}