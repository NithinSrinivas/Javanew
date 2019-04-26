class Tester
{
int x;
Tester (int a)
{
x = a;
}
public static void main (String []args)
{
System.out.println("-----MS-----");
Tester T1 = new Tester(60);
System.out.println(T1.x);
Tester T2= new Tester(80);
System.out.println(T2.x);
System.out.println("-----ME----"); 
}
}