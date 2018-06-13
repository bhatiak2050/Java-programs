public class Puppy1
{
	int puppyAge;
	public Puppy1(String name)
	{
		System.out.println("Passed Name is: " + name);
	}

	public void setAge(int age)
	{
		puppyAge = age;
	}	

	public int getAge()
	{
		System.out.println("Puppy's Age is: " + puppyAge);
		return puppyAge;
	}

	public static void main(String [] args)
	{
		Puppy1 myPuppy = new Puppy1 ("Tommy");
		myPuppy.setAge(2);
		int x = myPuppy.getAge();
		System.out.println("variable value: " + (myPuppy.puppyAge + x));
	}
}