public class CopyArray {
    public static void main(String[] args) {
        int arr1[] = {20 , 30, 40, 44, 30} ;

        int arr2[] = new int[arr1.length];

        for (int i=0; i<arr1.length; i++) {
            arr2[i] = arr1[i];

        }

        System.out.println("Copy arr2");

        for (int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
    
}
