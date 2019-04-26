class Staticparameter

{
static void area ( int r )
{
final double pi= 3.142;
double result = pi*r*r;
System.out.println(result);
}
}
class Demo
{
public static void main ( String []args)

	{
		Staticparameter.area(5);

	}

}
