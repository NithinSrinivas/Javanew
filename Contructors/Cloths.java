class Cloths
{
int ccost;
String ccolor;
String csize;
Cloths( int a, String b, String c)
{
ccost = a;
ccolor = b;
csize = c;
}

public static void main (String [] args )

{
Cloths c1 = new Cloths (1,"Blue","X,L,M");
System.out.println(c1.ccost);
System.out.println(c1.ccolor);
System.out.println(c1.csize);
}
}