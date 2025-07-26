package Approaches.Two_Pointers;

public class sort01Tp {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,0,1,0};
        int n = arr.length ;
        int leftPointer = 0;
        int rightPointer = n - 1;
        while(leftPointer < rightPointer){
       if(arr[leftPointer]==0){
        leftPointer ++;
       }
       else if(arr[rightPointer]==1){
        rightPointer--;
       }else{
        int temp = arr[leftPointer];
        arr[leftPointer]=arr[rightPointer];
        arr[rightPointer]=temp;
        leftPointer++;
        rightPointer--;
       }
        }
    for(int i = 0 ; i< n ; i++){
        System.out.print(" "+arr[i]);
    }
    }

}
