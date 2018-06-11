import java.io.*;
import java.lang.String;

public class String1
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String a;

        System.out.println("Enter the String: ");
        a = in.readLine();

        StringBuffer b = new StringBuffer(a.length());

        for(int i=0; i<a.length(); i++)
        {
            if(Character.isUpperCase(a.charAt(i))) b.append(Character.toLowerCase(a.charAt(i)));
            else b.append(Character.toUpperCase(a.charAt(i)));
        }

        System.out.println(b);
    }
}
