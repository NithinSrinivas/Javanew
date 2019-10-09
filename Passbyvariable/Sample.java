class Sample
{
int x =50;
int r = 10;
final double pi =3.142;

static void disp ()
{
System.out.println("hello");
}

public static void main (String []args)
{
Sample s1 = new Sample ();
System.out.println(s1.x);
System.out.println(s1.pi*s1.r*s1.r);
s1.disp();
}
}