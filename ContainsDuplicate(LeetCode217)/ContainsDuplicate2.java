import java.util.*;

public class ContainsDuplicate2 {

    public static void main(String[] args) {
        int[] nums = { 1, 5, 3, 2, 6 , 2};
        int n = nums.length;
        boolean dupF = false;
        Arrays.sort(nums); // NlogN
        for (int i = 0; i < n-1 ; i++) {  // N-1
            if (nums[i] == nums[i + 1]) {
                dupF = true;
                break;
            }
            if (dupF)
                break;
        }

        if (dupF) {
            System.out.println("True ! it's contain Duplicate Values . ");
        } else {
            System.out.println("false ! it's not contain Duplicate Values . ");
        }
    }

}

//Time Complexity is NlogN