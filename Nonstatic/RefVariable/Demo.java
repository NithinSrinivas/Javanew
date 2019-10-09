class Demo  // Circle with refernce types
void area()
{
final double pi = 3.142;
int r = 5;
double result = pi * r *r ;
System.out.println(result);
}
public static void main (String []args)
{
Demo d1 = new Demo();
d1.area();
}
}