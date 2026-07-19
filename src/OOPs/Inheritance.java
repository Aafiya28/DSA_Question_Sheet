package OOPs;

public class Inheritance {

    //OOPs 2nd Pillar -> Inheritance
    public static void main(String[] args) {

        Car c = new Car("Maruti", "800", 4, 5, "Auto");

        System.out.println("Name: " + c.name + ", Model:  " +  c.model + ", No of Tyres: " +  c.noOfTyres + ", No of Doors: " + c.noOfDoors + ", Transmission Type: " + c.transmissionTypes);
        c.startEngine();
        c.startAC();
        c.stopEngine();

        MotorCycle m = new MotorCycle("Splendor", "Xline", 2, "U", "Soft" );

        System.out.println("Name: " + m.name + ", Model: " + m.model + ", No. of Tyres: " + m.noOfTyres + ", Handle Bar Types: " + m.handleBarTypes + ", Suspension Types: " + m.suspensionTypes);

        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}

class Vehicles {

    public String name;

    public String model;

    public int noOfTyres;

    Vehicles(){
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    Vehicles(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine(){
        System.out.println("Engine is Starting");
    }

    void stopEngine(){
        System.out.println("Engine is Stop");
    }
}

class  Car extends Vehicles{

    public int noOfDoors;

    public String transmissionTypes;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionTypes){
        super(name, model, noOfTyres);

        this.noOfDoors = noOfDoors;
        this.transmissionTypes = transmissionTypes;
    }

    void startAC(){
        System.out.println("AC is started of " + name);
    }
}

class MotorCycle extends  Vehicles{

    public String handleBarTypes;
    public String suspensionTypes;

    MotorCycle(String name, String model, int noOfTyres, String handleBarTypes, String suspensionTypes){
        super(name, model, noOfTyres);

        this.handleBarTypes = handleBarTypes;
        this.suspensionTypes = suspensionTypes;
    }

    void wheelie(){
        System.out.println("Motorcycle is doing Wheelieeeee! " + name);
    }
}
