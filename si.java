import java.io.*;

class SI
{
	private int principle;
	private double rate;
	private int time;

	public SI(int principle, double rate, int time)
	{
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}

	public double getSI()
	{
		double si = (principle * time * rate) / 100;
		return si;
	}
};

class test
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));

		System.out.println("Enter the principle: ");
		int p = Integer.parseInt(in.readLine());

		System.out.println("Enter the time period: ");
		int t = Integer.parseInt(in.readLine());

		System.out.println("Enter the rate: ");
		double r = Double.parseDouble(in.readLine());

		SI ob = new SI(p, r, t);
		System.out.println("The Simple Interest is " + ob.getSI());
	}
}