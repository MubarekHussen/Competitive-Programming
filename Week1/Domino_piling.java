import java.util.*;
public class Domino
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int M, N, out;
        
        
        M = scan.nextInt();
        N = scan.nextInt();
        if (((M >= 1)&&(M <= 16)) && ((N >= 1)&&(N <= 16)))
        {
            out = (M * N) / 2;
        }
        System.out.println(out);
    }
}
