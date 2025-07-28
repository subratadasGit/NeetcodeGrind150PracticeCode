
public class TwoPointers {
    static void removeDuplicates(int nums[], int ele) {
        int n = nums.length;
       
        int j = 0;
    for(int i = 0 ; i < n ; i++){
        if(nums[i]!=ele){
            nums[j]=nums[i];
            j++;
        }
    }
    while(j<n){
        nums[j++]=-1;
    }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(" " + nums[k]);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3 };
        int ele = 3;
        removeDuplicates(nums, ele);
    }
}
