class circle
{
	final double pi = 3.14;
	private int radius;
	private double area, circumference;

	public circle(int radius)
	{
		this.radius = radius;
	}

	public double calculate_area()
	{
		area = pi * radius * radius;
		return area;
	}

	public double calculate_circumference()
	{
		circumference = 2 * pi * radius;
		return circumference;
	}
};

class test{
	public static void main(String[] args) {
		circle ob = new circle(3);

		System.out.println("The area is " + ob.calculate_area());
		System.out.println("The circumference is " + ob.calculate_circumference());
	}
}