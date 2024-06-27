package Recurssion;

public class AlternateSign {
    static int sumOfAleternate(int n) {
        if (n == 0) return 0;
        if (n % 10 == 0) {
            return sumOfAleternate(n-1) - n;
        } else {
            return sumOfAleternate(n - 1) + n;
        }
    }
    public static void main(String[] args) {
        System.out.println(sumOfAleternate(4));
    }
}
