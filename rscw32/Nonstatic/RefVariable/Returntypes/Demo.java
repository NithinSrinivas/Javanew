class Demo //reference variable with return types
{
double area ()
{
final double pi = 3.142;
int r = 5;
double result = pi * r * r;
return result;
}
public static void main (String []args)
{
Demo d1 = new Demo();
double x = d1.area();
System.out.println(x);
}
}