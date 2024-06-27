package Recurssion;

public class SumOfArray {
    static int sumArray(int[] arr,int index) {
        if (arr.length == index) return 0;
        int smallAns = sumArray(arr, index + 1);
        return smallAns + arr[index];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(sumArray(arr, 0));
        
    }
}
