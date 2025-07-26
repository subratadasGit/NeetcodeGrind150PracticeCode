package Approaches.Two_Pointers;

public class nonDecreasingOrder {
    public static void main(String[] args) {
        int arr[]={-10,-5,-3,1,4,6,8};
        int n = arr.length;
        int leftPointer = 0 ;
        int rightPointer  = n -1;
        int ans[]={};
        int count =  0 ;
        while(leftPointer<rightPointer)
        {
            if(Math.abs(arr[leftPointer])<Math.abs(arr[rightPointer])){
                ans[count++]=arr[rightPointer];
            }
            else{
                ans[count++]=arr[leftPointer];
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(" "+ans[i]);
        }
    }
}
