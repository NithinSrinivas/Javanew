class Mobile
{
int Mobcost;
String Mobcolour;
String Mobname;
Mobile (int a, String b, String c)
{
Mobcost = a;
Mobcolour = b;
Mobname = c;
}
public static void main (String []args)
{
Mobile m1 = new Mobile (1000,"black","Nokia");
System.out.println(m1.Mobcost);
System.out.println(m1.Mobcolour);
System.out.println(m1.Mobname);
}
}