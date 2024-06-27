import java.util.Scanner;
public class HypoMathClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,y,z;

        System.out.println("Enter the value of x");
        x = scanner.nextDouble();

        System.out.println("Enter the value of y");
        y = scanner.nextDouble();
        
        z = Math.sqrt((x*x)+(y*y));
         
        System.out.println("Square root of the x and y  is " + z );

        scanner.close();

    }
    
}
