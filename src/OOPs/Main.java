package OOPs;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Main Class");

        //Calling Default Constructor -> which don't have parameters
        Student A = new Student();
        A.id = 1;
        A.name = "Aiman";
        A.age = 26;
        A.nos = 5;

        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.nos);

        A.bunk();
        A.sleep();
        A.study();


        //Calling Parameter Constructor
        Student B = new Student(4, 17, "Minal", 5);
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.name);
        System.out.println(B.nos);


        //Calling Copy Constructor

        Student C = new Student(A);
        System.out.println(C.id);
        System.out.println(C.age);
        System.out.println(C.name);
        System.out.println(C.nos);
    }
}
