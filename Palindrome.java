import java.util.Scanner;
import java.lang.String;
public class Palindrome
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner (System.in);
        int a, b, s=0;
        System.out.println("Enter the number: ");
        a = in.nextInt();
        int n = a;
        while(a>0)
        {
            b=a%10;
            s=s*10+b;
            a=a/10;
        }
        if(s==n) System.out.println("It is a palindrome");
        else System.out.println("It is NOT a palindrome");
    }
}
