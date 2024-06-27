public class PrintArrayEvenPosition {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println("Even position array are follow: ");
        for (int i=1; i<arr.length; i=i+2) {
         System.out.println("Even position values are:" + arr[i]);
        }
    }
    
}
