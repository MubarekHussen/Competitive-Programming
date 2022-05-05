import java.lang.Math;
import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        double n, m, a;
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextDouble();
        m = scan.nextDouble();
        a = scan.nextDouble();
        
        System.out.println((int)(Math.ceil(n/a) * Math.ceil(m/a)));
        
    }
}
