class Trap
{
void area()
{
int a = 5;
int b = 5;
int h = 5;
int result = ((a+b)*0.5)*h;
System.out.println(result);
}
public static void main (String []args)
{
new Trap().area();
}
}