public class PrintReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("Reverse array are as follow: ");
        for (int i=arr.length; i>0; i--) {
            System.out.print(" " + arr[i] );
        }
    }
    
}

