import java.util.*;


public class twoSum3 {
public static void main(String[] args) {
    Map<Integer,Integer> map = new HashMap<>();
    int arr[]={12,4,5,9,6};
    int target = 9;
    
    for(int i = 0 ; i < arr.length ; i++){
        int complement = target - arr[i];

        if(map.containsKey(complement)){
            System.out.println("Two indexes :"+  " "  +map.get(complement)+ " " + i );
        }
        else{
        map.put(arr[i], i);
        }
    }

}
}

// Time Complexity is O(N)