package Practise_Set.OOPs;

public class Encapsulation {

    //OOPs 1st Pillar -> Encapsulation -------- { Practise }

    private int empId = 1;
    private String empName = "Employee";
    private int empSalary = 18000;


    public String getName() {
        return this.empName;
    }

    public int getId(){
        return this.empId;
    }

    public int getSalary(){
        return this.empSalary;
    }

    public Encapsulation(){

        System.out.println("Default Constructor of Encapsulation");
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
    }

    public Encapsulation(int id, String name, int salary){
        System.out.println("OOPs pillar Encapsulation -> Parameter Constructor");
        this.empId = id;
        this.empName = name;
        this.empSalary = salary;
    }


}
