import java.io.*;
class Computer
{
    private static int a;

    Computer() {a=0;}
    Computer(int x) {a=x;}

    public static void Compute()
    {
        System.out.println("Natural Logarithem: " + Math.log(Math.abs(a)));
        System.out.println("Absolute Value " + Math.abs(a));
        System.out.println("Square root " + Math.sqrt(Math.abs(a)));
        System.out.println("Random number " + Math.random());
    }
    public static void getInput(String [] args) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the number: ");
        a = Integer.parseInt(in.readLine());
    }
}