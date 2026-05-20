package Practise_Set;

public class Function {
    //Function or Method

    static void PRINTWELCOMEMESSAGE(){

        System.out.println("Welcome to Java Method & Function Segment");

    }

    static int Add(int a, int b){

        int sum = a + b;
        return sum;
    }

    static boolean isEven(int n){

        if(n%2 == 0){
            return true;
        }
        return false;
    }

    static int getMaximum(int a, int b){


        if(a > b){
            return a;
        }else {
            return b;
        }

        //By using Built-in method get maximum number:
//        int max = Math.max(a,b);
//        return max;
    }

    static void calculatePercentage(int obt, int total){

        double percentage = ((double)obt / total ) * 100;

        System.out.println(Math.round(percentage) + "%");
    }

    public static void main(String[] args) {

        PRINTWELCOMEMESSAGE();

        System.out.println( Add(4,7) );

        System.out.println(isEven(9));

        System.out.println(getMaximum(9,4));

        calculatePercentage(441, 600);

    }
}
