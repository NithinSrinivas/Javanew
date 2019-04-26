class  Circlereturntype
{
	static double area ()

	{
		final	double pi = 3.142;
		int r = 5;
		double result = pi*r*r;
		return result;
	}
}

class Ding
{
	public static void main(String[] args) 
	{
		double x = Circlereturntype.area();
		System.out.println(x);
	}
}
