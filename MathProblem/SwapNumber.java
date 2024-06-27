
public class SwapNumber {
    public static void main(String[] args) {
        int a=10,b=20;
        // b=a+b-(a=b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a + " " + b);
    }
    
}
