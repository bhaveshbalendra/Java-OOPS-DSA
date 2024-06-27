package Recurssion;

public class SumofDigit {
   static int sod(int n) {
        if ( n <= 9 && n > 0) return n;
        return sod(n/10) + n%10;
   }
   public static void main(String[] args) {
    System.out.println(sod(1234));
   } 
}
