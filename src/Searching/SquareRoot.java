package Searching;

import java.util.Scanner;

public class SquareRoot {

    //Given an integer X, find its square root. If X is not a perfect square, then return floor(√x).
    static int squareN(int x){

        int low = 1;
        int high = x;

        int ans = -1;

        while(low <= high){

            int mid = (low+high)/2;
            int sqr = mid*mid;

            if(sqr == x){
                return mid;
            } else if (sqr > x) {
                high = mid-1;
            }else {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. for checking Square Root: ");
        int x = sc.nextInt();

        int result = squareN(x);

        System.out.println(result);
    }
}
