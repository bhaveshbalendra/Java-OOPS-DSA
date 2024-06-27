public class SumOfAllArrayElements {
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,4,5,6,5};
        int num=arr[0];
        for (int i=1; i<arr.length; i++) {
            num=num+arr[i];
        }
        System.out.println("The sum of all element in the array is: " + num);
    }
    
}
