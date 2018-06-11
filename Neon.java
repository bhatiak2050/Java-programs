import java.util.Scanner;

public class Neon
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        int a, b, s=0, n;
        System.out.println("Enter the number: ");
        a = in.nextInt();
        n=a;
        a=a*a;
        while(a>0)
        {
            b=a%10;
            s=s+b;
            a/=10;
        }
        if(s==n) System.out.println("It is a Neon number");
        else System.out.println("It is NOT a Neon number");
    }
}
