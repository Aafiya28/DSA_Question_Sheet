package Arrays;

import java.util.Scanner;

public class EquilibriumPoint {

    //Naive solution
    static boolean equlPointN(int[] arr){

        int n = arr.length;

        for(int i=0; i<n; i++){
            int ls=0;
            int rs=0;
            for(int j=0; j<i; j++){
                ls += arr[j];
            }
            for(int k=i+1; k<n; k++){
                rs += arr[k];
            }
            if(ls == rs){
                return true;
            }
        }
        return false;
    }

    static boolean equlPointE(int[] arr){

        int n = arr.length;

        int rs = 0;

        for(int i=0; i<n; i++){
            rs += arr[i];
        }

        int ls = 0;
        for(int i=0; i<n; i++){
            rs -= arr[i];

            if(ls == rs){
                return true;
            }
            ls += arr[i];
        }

        return false;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean ansN = equlPointN(arr);
        boolean ansE = equlPointE(arr);

        System.out.println("By Naive Solution checking equilibrium point present or not");
        System.out.println("Equilibrium Point: " + ansN);
        System.out.println();
        System.out.println("By Efficient Solution checking equilibrium point present or not: ");
        System.out.println("Equilibrium Point: " + ansE);
    }

    public static class FrequencyOfEle {

        static void freqOfEle(int[] arr){

            int n = arr.length;

            int freq = 1;
            int i=1;

            while(i < n){

                while (i<n && arr[i] == arr[i-1]){
                    freq++;
                    i++;
                }
                System.out.println(arr[i-1] + " " + freq);
                i++;
                freq = 1;
            }

            if(n == 1 || arr[n-1] != arr[n-2]){
                System.out.println(arr[n-1] + " " + 1);
            }
        }

        public static void main(String[] args){

            int[] arr = {10, 10, 20, 20, 20, 40};

            freqOfEle(arr);
        }
    }
}
