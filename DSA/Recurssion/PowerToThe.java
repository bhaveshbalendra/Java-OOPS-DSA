package Recurssion;

public class PowerToThe {
    static int returnMul(int p, int q) {
        if (q == 0) return 1;
        return returnMul(p, q - 1) * p;
    }

    public static void main(String[] args) {
        System.out.println(returnMul(3, 2));
    }
}
