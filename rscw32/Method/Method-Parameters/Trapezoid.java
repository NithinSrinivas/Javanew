class Trapezoid
{

	static void area (int a, int b, int h)
	
	{
	int result = ((a+b)/2)*h;   // As per the division i was getting 1.5 but final answer was 3 after leaving 0.5
	System.out.println(result);
	}
	
	public static void main(String[] args) 
	
	{
		System.out.println("***Main Starts***");
		area (1,2,3);
		System.out.println("***Main Ends***");
	}
}
