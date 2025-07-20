package BinarySearch;

public class BinarySearch {

    public static int BinarySearchMethod(int arr[], int srch) {

        int l = 0;
        int h = arr.length - 1;
        
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == srch) {
                return mid;
            }
            if (arr[mid] < srch) {
                l = mid + 1;

            } else {
                h = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int nums[] = { 1, 5, 6, 8 };
        int searchValue = 6;

        System.out.println(BinarySearchMethod(nums, searchValue));

    }
}
