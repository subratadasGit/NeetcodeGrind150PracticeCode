
public class twoSum {
    public static void main(String[] args) {
        int nums[] = {1,2,5,4};
        int target = 3 ;
        int i , j ;
        int index1 = 0 ;
        int index2 = 0 ;
        for( i = 0 ; i < nums.length ; i++){
            for(j = 0 ; j < nums.length ; j++){
                if(nums[i]+nums[j]==target){
                    index1 = i;
                    index2 = j;                }
            }
        }

        System.out.println("first index is "+index1+" "+"Second index is "+index2);
    }
}


//Time complexity is very expensive like o(N^2)