package OOPs;

public class InheritanceTask {

    public static void main(String[] args) {

        //** Single Inheritance
        Developer d =new Developer("John", 101, "Java");
        d.show();

        //** Multiple Inheritance
        TechLead tl = new TechLead("John", 79, "AI Project", 7);
        tl.displayInfo();

        //** Multilevel Inheritance
        HRDirector hrD = new HRDirector("Lucy Madan", 394);
        hrD.handleHRDuties();
        hrD.manageHRDepartment();
    }
}

//** Parent Class or Super Class
class Employee{

    public String empName;
    public int empId;

    Employee(){
        this.empName = "";
        this.empId = 0;
    }

    Employee(String empName, int empId){
        this.empName = empName;
        this.empId = empId;
    }

    void display(){
        System.out.println("Employee Registered");
        System.out.println("Employee: " + empName + ", ID: " + empId);
    }
}

//** Interface for Multiple Inheritance
interface TeamLead{

    void leadTeam();
}

interface ProjectManager{

    void manageProject();
}

//** Multiple Inheritance using Interface
class TechLead extends Employee implements ProjectManager, TeamLead{

    private String manageProject;
    private int teamSize;

    public TechLead(String empName, int empId, String project, int size){
        super(empName, empId);
        this.manageProject = project;
        this.teamSize = size;
    }

    public void displayInfo(){
        display();
        manageProject();
        leadTeam();
    }

    public void manageProject(){
        System.out.println("Project Manager managing project: " + manageProject);
    }

    public void leadTeam(){
        System.out.println("Team Lead leading a team of " + teamSize + " members.");
    }

}

//** Single Inheritance
class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String empName, int empId, String lang){
        super(empName, empId);
        this.programmingLanguage = lang;
    }

    public void show(){
        display();
        System.out.println("Specialization: Developer, Programming Language: " + programmingLanguage);
    }
}

//** Multilevel Inheritance
class HRManager extends Employee{

    public HRManager(String empName, int empId){
        super(empName, empId);
    }

    public void handleHRDuties(){
        System.out.println("HR Manager handling human resources duties");
    }
}

class HRDirector extends HRManager{

    public HRDirector(String empName, int empId){
        super(empName, empId);
    }

    public void manageHRDepartment(){
        System.out.println("HR Director managing HR department duties");
    }
}