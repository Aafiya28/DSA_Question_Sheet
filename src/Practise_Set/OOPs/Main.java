package Practise_Set.OOPs;

public class Main {

    public static void main(String[] args){

        Encapsulation D = new Encapsulation();

        System.out.println("Emp Id: " + D.getId());
        System.out.println("Emp Name: " + D.getName());
        System.out.println("Emp Salary: " + D.getSalary());

        //Parameter Constructor
        Encapsulation E = new Encapsulation(4, "Aiman", 19500);

        System.out.println("Emp Id: " + E.getId());
        System.out.println("Emp Name: " + E.getName());
        System.out.println("Emp Salary: " + E.getSalary());
    }
}
