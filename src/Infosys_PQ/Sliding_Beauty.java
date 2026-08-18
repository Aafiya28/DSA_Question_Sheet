package Infosys_PQ;

public class Sliding_Beauty {

    //Sliding SubArray Beauty
    public static int[] getSubarrayBeauty(int[] arr, int k, int x){

        int n = arr.length;

        int[] result = new int[n-k+1];
        int[] freq = new int[101];

        int l=0;
        int r=0;
        int idx=0;

        while (r<n){

            freq[arr[r]+50]++;

            if(r-l+1 == k){

                int count=0;
                int beauty=0;

                for(int i=0; i<50; i++){

                    count += freq[i];

                    if(count >= x){
                        beauty = i-50;
                        break;
                    }
                }

                result[idx++] = beauty;

                freq[arr[l] + 50]--;
                l++;
            }
            r++;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,-1,-3,-2, 3};
        int k = 3;
        int x = 2;

        int[] beauty = getSubarrayBeauty(arr, k, x);

        for(int num : beauty){
            System.out.print(num + ", ");
        }
    }
}
