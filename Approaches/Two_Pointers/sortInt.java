package Approaches.Two_Pointers;

public class sortInt {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n = arr.length ;
        int leftPointer = 0;
        int rightPointer = n-1 ;
        while(leftPointer < rightPointer){
            if(arr[leftPointer]%2==0){
                leftPointer++;
            }
            else if(arr[rightPointer]%2!=0){
                rightPointer--;

            }else{
                int temp = arr[leftPointer];
                arr[leftPointer]=arr[rightPointer];
                arr[rightPointer]=temp;
                leftPointer++;
                rightPointer--;
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(" "+arr[i]);
        }
    }
}

// even numbers followed by odd numbers