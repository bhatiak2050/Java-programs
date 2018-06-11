import java.util.Scanner;
public class HCF
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int x, y, p, i, hcf=0;
        System.out.println("Enter the two numbers: ");
        x = in.nextInt();
        y = in.nextInt();
        if(x==0 || y==0)
        {
            System.out.println("The HCF is: " + ((x==0)?y:x));
            System.exit(0);
        }
        p = x * y;
        for (i = 1; i < p; i++)
            if (x % i == 0 && y % i == 0)
                hcf = i;
        System.out.println("The HCF is: " + hcf);
    }
}