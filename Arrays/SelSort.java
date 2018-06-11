package Arrays;

import java.io.*;

public class SelSort
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader((System.in)));
        int i, j, p, n, t;
        System.out.println("Enter the size: ");
        n = Integer.parseInt(in.readLine());
        int ar[] = new int[n];

        System.out.println("Enter the array elements: ");
        for(i=0; i<n; i++)
            ar[i] = Integer.parseInt(in.readLine());

        for(i=0; i<n-1; i++)
        {
            p=i;
            for(j=i+1; j<n; j++)
                if(ar[j] < ar[p])
                    p=j;

            t=ar[i];
            ar[i] = ar[p];
            ar[p] = t;
        }

        System.out.println("The new array is: ");
        for(i=0; i<n; i++)
            System.out.println(ar[i] + " ");
    }
}
