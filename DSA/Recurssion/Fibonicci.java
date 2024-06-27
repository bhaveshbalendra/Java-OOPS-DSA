package Recurssion;

public class Fibonicci {
    static int returnNumber(int n) {
        if (n == 0 || n ==1) return n;

        int prevFibo = returnNumber(n-1);
        int nextFibo = returnNumber(n-2);
        return prevFibo + nextFibo;

    }
    public static void main(String[] args) {
     
        for (int i = 0; i < 10; i++) {
            System.out.println(returnNumber(i));
        }
    }
}
