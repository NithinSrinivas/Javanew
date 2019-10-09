class Parallel //b*h
{
void area ( int b,int h)
{
int result = b*h;
System.out.println(result);
}
public static void main (String []args)
{
new Parallel().area(10, 10);
}
}