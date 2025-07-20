import java.util.Arrays;

public class twoSum2 {
    public static int BinarySearch(int arr[], int SearchValue){
        int l = 0 ; 
        int h = arr.length - 1 ;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==SearchValue){
                return mid ;
            }
            if(arr[mid]<SearchValue){
                l = mid+1 ;
            }
            else{
                h = mid-1 ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int nums[] ={ 5, 4 ,7 , 6 , 3};
        int target = 13;
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length ;i++){
            int complement = target - nums[i];
           if(BinarySearch(nums, complement)!=-1){
            System.out.print(BinarySearch(nums, complement)+" ");
           }
        }
    }
}

//Time complexity is N 