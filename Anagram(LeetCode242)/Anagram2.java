//Given Two strings s and t  , its return true if t is an anagram of s and false other wise s = cat , t = tac returns true but s = sam and t = sat  return false 
public class Anagram2 {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        } else {

            String s1 = s.toLowerCase();
            String t1 = t.toLowerCase();

            int charCount[] = new int[26];

            for (int i = 0; i < s.length(); i++) {

                charCount[s1.charAt(i) - 'a']++;
                charCount[t1.charAt(i) - 'a']--;
            }

            for (int count : charCount) {
                if (count != 0) {
                    return false;
                } 
        }
        return true ; // if all cases run smoothly then returns true 
    
    }
        
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("cat", "tas"));
        System.out.println(isAnagram("cat", "tac"));
    }
}

// time complexity o(N)