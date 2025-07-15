public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 5, 3 };
        int n = nums.length;
        boolean dupF = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    dupF = true;
                    break;
                }
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
