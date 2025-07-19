
//Given Two strings s and t  , its return true if t is an anagram of s and false other wise s = cat , t = tac returns true but s = sam and t = sat  return false 

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {

            char c[] = s.toLowerCase().toCharArray();
            char v[] = t.toLowerCase().toCharArray();

            Arrays.sort(c);
            Arrays.sort(v);

            if (Arrays.equals(c, v)) {
                return true;
            } else {
                return false;
            }

        }
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("cat", "act"));
        System.out.println(isAnagram("null", "Luln"));

    }
}

// Time complexity is o(NLogN)
