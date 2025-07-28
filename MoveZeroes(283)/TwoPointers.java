

public class TwoPointers {

    static void moveZeroes(int nums[]){
        int n = nums.length ;
        int j = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<n){
            nums[j++]=0;
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(" "+nums[i]);
        }
    }
    public static void main(String[] args) {
        int nums[]={2,0,3,4,0,6};
        moveZeroes(nums);
    }
}
