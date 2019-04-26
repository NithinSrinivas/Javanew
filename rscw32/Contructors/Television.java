class Television
{
int Tvcost;
String Tvbrand;
String Tvtype;
Television( int a, String b, String c)
{
Tvcost = a;
Tvbrand = b;
Tvtype = c;
}

public static void main (String [] args )

{
Television t1 = new Television (1,"Samsung","Smart 4k");
System.out.println(t1.Tvcost);
System.out.println(t1.Tvbrand);
System.out.println(t1.Tvtype);

}
}