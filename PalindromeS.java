import java.util.Scanner;

public class PalindromeS
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner (System.in);
        String a;
        System.out.println("Enter the string: ");
        a = in.nextLine();
        String b = new StringBuilder(a).reverse().toString();
        if(a.equals(b)) System.out.println("The string is a Palindrome: ");
        else System.out.println("The string is NOT a Palindrome");
    }
}
