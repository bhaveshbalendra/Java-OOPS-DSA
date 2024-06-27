package Recurssion;

public class ArrayRecussion {
    static void print(int arr[],int index)  {
        if (arr.length == index ) return;
        System.out.println(arr[index]);
        print(arr, index + 1);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,2,6,7};
        print(arr, 0);
    }
}
