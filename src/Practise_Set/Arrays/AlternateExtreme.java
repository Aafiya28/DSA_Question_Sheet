package Practise_Set.Arrays;

public class AlternateExtreme {

    //Printing Alternate Extreme Elements of an array
    static int[] getAlternateExEle(int[] arr){

        int n = arr.length;

        int[] newArr = new int[n];

        int left = 0;
        int right = n-1;
        int k = 0;

        while (left <= right){

            if(left == right){
                newArr[k++] = arr[left];
            }else  {
                newArr[k++] = arr[left];
                newArr[k++] = arr[right];
            }

            left++;
            right--;
        }

        return newArr;
    }

    //Optimal Solution
    static void getExtremeEle(int[] arr){

        int n = arr.length;

        int i=0;
        int j = n-1;

        while (i <= j){

            if(i == j){
                System.out.print(arr[i] + " ");
                return;
            }else {
                System.out.print(arr[i] + " ");
                System.out.print(arr[j] + " ");
            }

            i++;
            j--;
        }

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        int[] result = getAlternateExEle(arr);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();

        getExtremeEle(arr);
    }
}
