package OOPs;

public class Encapsulation {

    private String empName;
    private int empId;
    private int empAge;

    //Getter & Setter Method for Name:
    public String getName(){
        return this.empName;
    }

    public void setEmpName(String name){
        this.empName = name;
    }

    //Getter & Setter Method for Id:
    public int getEmpId(){
        return this.empId;
    }

    public void setEmpId(int id){
        this.empId = id;
    }

    //Getter & Setter Method for Age:
    public int getEmpAge(){
        return this.empAge;
    }

    public void setEmpAge(int age){
        this.empAge = age;
    }

    public Encapsulation(int empId, String empName, int empAge) {
        System.out.println("OOPs Pillar Encapsulation");
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }

    public static void main(String[] args){

    }

}
