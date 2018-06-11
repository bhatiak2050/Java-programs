package Arrays;

import java.io.*;

public class Binary_Search
{
    public static void main (String [] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n, i, s, flag=0, mid, beg=0, last;

        System.out.println("Enter the array size: ");
        n = last = Integer.parseInt(in.readLine());
        int ar[] = new int[n];

        System.out.println("Enter the array elements: ");
        for(i=0; i<n; i++)
            ar[i] = Integer.parseInt(in.readLine());

        System.out.println("Enter the element to be found: ");
        s = Integer.parseInt(in.readLine());

        while(beg <= last)
        {
            mid = (beg+last)/2;
            if(ar[mid] < s)
                beg = mid+1;
            else if(ar[mid] > s)
                last = mid-1;
            else if(ar[mid] == s)
            {
                System.out.println(ar[mid] + " found at index " + (mid+1));
                flag=1;
                break;
            }
        }
        if(flag==0) System.out.println("Element not found");
    }
}
