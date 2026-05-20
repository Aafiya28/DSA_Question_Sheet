package Arrays;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("Enter element for row " + i + " & col " + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        //1. Printing Matrix of an array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //2. Finding Sum of all elements of an array
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all elements of array: " + sum);

        //3. Finding Maximum Value of an array
        int maxValue = arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println("Maximum element in array is: " + maxValue);

        //4. Finding Row wise sum of an array
        for(int i=0; i<arr.length; i++){
            int rowSum = 0;
            for(int j=0; j<arr[i].length; j++){
                rowSum += arr[i][j];
            }
//            System.out.println("Sum of row: " + i + " is: " + rowSum);
        }

        //5. Finding Column wise sum of an array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                int colSum = 0;
                for(int k=0; k<arr.length; k++){
                    colSum += arr[k][j];
                }
//                System.out.println("Sum of col: " + j + " is: " + colSum);
            }
        }

        //6. Converting Column into Row
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        //7. Printing Diagonal Elements
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i == j){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        //8. Printing Sum of Diagonal Element
        int diagonalSum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                if(i == j){
                    diagonalSum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal is: " + diagonalSum);

        //9. Searching element in matrix array (2D Array)
        int x = 7;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                if(arr[i][j] == x){
                    System.out.print("Present");
                }else {
                    System.out.println("Not Present");
                }
            }
        }
    }
}
