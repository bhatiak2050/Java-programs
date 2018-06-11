import java.util.Scanner;
public class Fibonacci
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int a=0, b=1, sum=0, i, s, e;
        System.out.println("Enter the start and end: ");
        s = in.nextInt();
        e = in.nextInt();
        for(i=s; sum<=e; i++)
        {
            a=b;
            b=sum;
            System.out.print(sum + " ");
            sum = a+b;
        }
    }
}
