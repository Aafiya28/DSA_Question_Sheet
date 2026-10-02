package Arrays;

public class MajorityElement {

    //Brute Force Solution. TC - O(N^2) SC - O(1)
    static int majorityEle(int[] arr){

        int n = arr.length;

        int maxCount = 0;
        int maxEle = 0;

        for(int i=0; i<n; i++){
            int count = 0;
            int currEle = arr[i];
            for(int j=0; j<n; j++){
                if(arr[j] == currEle){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                maxEle = currEle;
            }
        }

        return maxEle;
    }

    //Optimal Solution. TC - O(N) SC - O(1)

    public static void main(String[] args) {

        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int majorityElement = majorityEle(arr);

        System.out.println("Majority Element: " + majorityElement);
    }
}
