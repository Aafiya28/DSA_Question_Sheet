package OOPs;

class Emp{

    int empID = 2401;
    int basicSalary = 20000;
    int incentive = 300;

    void countSalary(){
        System.out.println("Salary: " + basicSalary + incentive);
    }
}

public class Encapsulation {

    public static void main(String[] args){

        Emp emp1 = new Emp();
        System.out.println(emp1.empID);


    }

}
