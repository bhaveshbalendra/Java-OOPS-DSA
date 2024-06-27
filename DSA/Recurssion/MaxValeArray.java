package Recurssion;

public class MaxValeArray {

    static  void findMax(int arr[], int index, int max) {
        
        max = Math.max(arr[index], max);
        if (arr.length-1 == index) {
            System.out.println(max);
            
        }
        findMax(arr, index + 1, max);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,2,6,7};
        findMax(arr, 0, 0);
        
    }
}
