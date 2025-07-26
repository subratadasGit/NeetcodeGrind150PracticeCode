import java.util.*;

public class groupAnagram {
    public static void main(String[] args) {
        String words[]={"eat","doll","ate","tea","lodl"};
        for(String word : words){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String s[] = new String(ch);
        }
    }
}
