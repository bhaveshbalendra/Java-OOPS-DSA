package Recurssion;

public class FindElementInArrayRecr {
    static Boolean findNumber(int[] arr, int n, int x,int index) {
        if (index == n) return false;
        findNumber(arr, n, x, index + 1);
        if (x == arr[index]) {
            return true;
    
        }
        
        return false;

    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,2,6,7};
        System.out.println(findNumber(arr, 5, 7, 0));
        
    }
}
