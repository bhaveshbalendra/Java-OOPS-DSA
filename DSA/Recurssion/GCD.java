package Recurssion;

public class GCD {
    static int gcdNumber(int x, int y) {
        if (y == 0) return x;
        return gcdNumber(y, x%y);
    }
    public static void main(String[] args) {
        int x = 16 ,y = 12;
        System.out.println(gcdNumber(x, y));
        System.out.printf("The LCM and GCD of the %d and %d is %d and %d",x,y,x*y/gcdNumber(x, y),gcdNumber(x, y));
    }
}
