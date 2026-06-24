package OOPs;

public class Student {

    public int id;
    public String name;
    public int age;
    public int nos;


    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public void bunk() {
        System.out.println(name + " is bunking");
    }

    /**
     * In OOPs their there are 3 Types of Constructor
     * 1. Default Constructor
     * 2. Parameter Constructor
     * 3. Copy Constructor
     */

    // Default Constructor
    public Student(){
        System.out.println("Student Default Constructor Called");
    }

    //Parameter Constructor
    public Student(int id, int age, String name, int nos){
        System.out.println("Student Parameter Constructor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //Copy Constructor
    public Student(Student srcObj){
        System.out.println("Student Copy Constructor Called");
        this.id = srcObj.id;
        this.age = srcObj.age;
        this.name = srcObj.name;
        this.nos = srcObj.nos;
    }
}
