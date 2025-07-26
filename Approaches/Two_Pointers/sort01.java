package Approaches.Two_Pointers;

public class sort01 {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1,1,0,0};
        int n = arr.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]==0){
                arr[count++]=0;
            }
        }
        while(count< n ){
            arr[count++]=1;
        }

       for(int i =0 ; i < n ; i++){
        System.out.print(" "+arr[i]);
       }
    }
}
