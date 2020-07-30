import java.math.*;
import java.io.*;

class BankAccount
{
	private double balance;
	private String acctype;
	private double rate;

	public static int no_of_accouts;

	static
	{
		no_of_accouts = 0;
	}

	public BankAccount (String acctype)
	{
		this(acctype, 8.75);
	}

	public BankAccount (String acctype, double rate)
	{
		if(acctype == "type1") balance = 25000.0;
		else if(acctype == "type2") balance = 45000.0;

		this.rate = rate;
		no_of_accouts++;
	}

	public void add1yrinterest()
	{
		double interest = (balance * 1 * rate) / 100;
		balance += interest;
	}

	public double getbalance()
	{
		return balance;
	}
};

class test{
	public static void main(String[] args) throws IOException
	{

		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));

		System.out.println("Enter the acctype (1/2): ");
		String type = in.readLine();

		type = (type.equals("1"))?"type1":"type2";

		System.out.println("Enter the rate (enter 0 for default): ");
		double rate = Double.parseDouble(in.readLine());

		BankAccount ob1 = (rate == 0)? new BankAccount(type): new BankAccount(type, rate);

		ob1.add1yrinterest();

		System.out.println("The updated balance is " + ob1.getbalance());

		BankAccount ob2 = new BankAccount("type1", 5);

		System.out.println("The number of Bank Accounts is " + ob2.no_of_accouts);
	}
}