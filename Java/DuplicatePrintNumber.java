public class DuplicatePrintNumber {
    public static void main(String[] args) {
        int arr[] = {1,3,4,3,2,4,5,5,3,9,6};
        int flag=-1;
        
        for (int i=0; i<arr.length; i++) {
            int count=1;
            if(flag!=-1) {
            for (int j=0; j<arr.length-1; j++) {
                if(arr[i]==arr[j+1]) {
                    count++;
                    arr[j+1] = flag; 
                }
            }

        }
        }
    }
    
}
