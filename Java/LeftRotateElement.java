import java.util.Scanner;

public class LeftRotateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numers: ");
        int arr[] = new int[5];
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();


        for (int i=0; i<n; i++ ) {
            int first=arr[0];

            for(int j=0; j<arr.length-1; j++) {
                arr[j] = arr[j+1];
                
            }
            arr[arr.length-1] = first;
        }

        for (int i=0; i<arr.length-1; i++) {
            System.out.println("Elements are : " + arr[i]);
        }
    }
    
}
