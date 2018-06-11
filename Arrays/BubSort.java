package Arrays;

import java.io.*;

public class BubSort
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i, j, n, t;
        System.out.println("Enter the size: ");
        n = Integer.parseInt(in.readLine());
        int ar[] = new int[n];

        System.out.println("Enter the elements: ");
        for(i=0; i<n; i++)
            ar[i] = Integer.parseInt(in.readLine());

        for(i=0; i<n; i++)
        {
            for(j=0; j<n-1-i; j++)
                if(ar[j] > ar[j+1])
                {
                    t=ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = t;
                }
        }
        System.out.println("The new array is: ");
        for(i=0; i<n; i++)
            System.out.println(ar[i] + " ");
    }
}
