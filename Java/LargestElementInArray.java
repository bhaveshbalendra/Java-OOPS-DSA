public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = new int[] {80,1,40,4,6,39,70};
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element in the array is: " + max);
    }
}
