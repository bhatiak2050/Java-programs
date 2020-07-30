class SampleData
{
	private int a;
	private double b;
	private char c;

	public SampleData(int a, double b, char c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void display(){
		System.out.println(a + " " + b + " " + c);
	}
}

class test{

	public static void main(String[] args) 
	{
		SampleData ob = new SampleData(5, 2.545454, 'a');
		ob.display();
	}
}