package Patterns;

public class HollowPattern {
    public static void main(String[] args) {

        int num = 4;
    //Whole Rectangular Pattern
        for(int i=1; i<=num; i++){
            for(int col=1; col<=6; col++){

                if(i==1 || i==num){
                    System.out.print("* ");
                }else{
                    if(col==1 || col==6){
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

        //----------------------------

        //Whole Triangle Pattern
        int n= 10;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){

                if(col==1 || row==n || col==row){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
