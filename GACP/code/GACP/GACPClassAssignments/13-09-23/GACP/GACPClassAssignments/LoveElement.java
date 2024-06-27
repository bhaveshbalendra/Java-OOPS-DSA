
import java.util.Scanner;
public class LoveElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = 1, b, c;
            int l = sc.nextInt();
            int[] loveElements = new int[l];
            for(int i=0; i<l; i++){
                loveElements[i]=sc.nextInt();
            }
            while (true){
            b=loveElements[a-1];
            c=loveElements[b-1];
            if (a==loveElements[c-1]){
                System.out.println("YES");
                break;
            }
            a++;
            if (a>loveElements.length){
                System.out.println("NO");
                break;
            }
   }
        }
    }
}
