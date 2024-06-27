package Recurssion;

public class KMultiples {
    static void H(int p, int q) {
        if (q == 1) {
            System.out.println(p);
            return;
        }
        H(p,q-1);
        System.out.println(p*q);
    }
    public static void main(String[] args) {
        int a =2, b = 5;
        H(a,b);

    }
}
