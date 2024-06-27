public class SmallestElementInArray {
    public static void main(String[] args) {
        int arr[] = new int[] {80,1,40,4,6,39,70};
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest Element in the array is: " + min);
    }
    
}
