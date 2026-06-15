package Practise_Set.Arrays;

public class IntersectionElements {

    //Printing intersection elements of array's
    static int[] getInterSection(int[] a1, int[] a2){

        int n = a1.length;
        int m = a2.length;

        int[] temp = new int[n];
        int k = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a1[i] == a2[j]){
                    temp[k++] = a1[i];
                    break;
                }
            }
        }

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a1 = {1,2,3,4,5};

        int[] a2 = {2,5,6,7,8};

        int[] ans = getInterSection(a1, a2);


        for (int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }

    }
}
