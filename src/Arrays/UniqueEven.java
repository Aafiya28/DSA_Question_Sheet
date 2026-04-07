package Arrays;

public class UniqueEven {

    //Find Unique Even Element
    static int uniqueEven(int[] nums){

        int n = nums.length;

        for(int i=0; i<n; i++){

            if(nums[i]%2 == 0){

                int count = 0;

                for(int j=0; j<n; j++){

                    if(nums[i] == nums[j]){

                        count++;
                    }
                }

                if(count == 1){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 5, 4, 6};

        int result =  uniqueEven(arr);

        System.out.println("Unique Even Element is: " + result);
    }
}
