public class OddOrder {

    public static void main(String[] args) {
        
        int arr[] = new int[] {20,30,50,49,30,50,53,75};

        for (int i=0; i<arr.length; i=i+2) {
            System.out.println("Elements at odd postion are: " + arr[i]);
        }
    }
    
}
