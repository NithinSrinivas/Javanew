class Trapezoid //1/2(a+b)*h
{
void area ( int a, int b,int h)
{
int result = (a+b)*0.5*h;
System.out.println(result);
}
public static void main (String []args)
{
new Trapezoid().area(10,10,10);
}
}