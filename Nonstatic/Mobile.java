class Mobile // 
{
int Mcost;
String Mname;
String Mcolour;

public static void main (String []args)
{
Mobile m1 = new Mobile ();
m1.Mname = "Nokia";
m1.Mcolour= "Blue";
m1.Mcost = 10000;
System.out.println(m1.Mname);
System.out.println(m1.Mcolour);
System.out.println(m1.Mcost);
}
}