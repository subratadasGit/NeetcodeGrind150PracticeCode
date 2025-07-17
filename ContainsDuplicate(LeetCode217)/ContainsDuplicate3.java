import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate3 {

    public static void main(String[] args) {
        int nums[] = { 1, 5, 6, 4, 3, 4 };
        HashSet<Integer> seenNumbers = new HashSet<>();
        boolean dupF = false;
        for (int num : nums) {
            if (seenNumbers.contains(num)) {
                dupF = true;
                break;
            }
            seenNumbers.add(num);
            if (dupF)
                break;

        }
        if (dupF == true) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

    }

}
