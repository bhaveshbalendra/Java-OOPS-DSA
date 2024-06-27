package Recurssion;



class PrintNaturalNumber {
    static void naturalNumber(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        naturalNumber(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n =10;
        naturalNumber(n);
    }
}