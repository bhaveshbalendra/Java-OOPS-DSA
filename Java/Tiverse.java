import java.util.Scanner;

class Tiverse {
    public static void main(String[] args) {
        System.out.println("Enter the elements ");
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];

        int arr2[] = new int[arr1.length];


        for (int i=0; i<arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        
        int flag=-1;
        for (int i=0; i<arr1.length; i++) {
            int count=0;
            for (int j=i+1; j<arr1.length; j++ ) {
                if(arr1[i]==arr2[j]) {
                count++;
                arr1[j]=flag;
                }
            }
            if(arr2[i]!=flag){
              arr2[i]=count;  
            }
        }

        for (int i=0; i<arr1.length; i++) {
            if(arr1[i]!=arr2[i]) {
                System.out.println("The frequency of " + arr1[i] + " is " + arr2[i]);
            }
        }

        


    }
}