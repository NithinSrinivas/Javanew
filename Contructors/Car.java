class Car  //identifier
{
int ccost; // Non static variable
String ctype;
String cname;
String cmodel;
Car ( int a, String b, String c, String d) // Constructure with Parameter and defining static variable linking to non static variable
{
ccost = a;
ctype = b;
cname = c;
cmodel = d;
}
public static void main( String []args)
{
Car c1 = new Car(10000,"petrol","Audi","4X4");  // defining reference variable and object with arguments linking to parameter 
System.out.println(c1.ccost);
System.out.println(c1.ctype);
System.out.println(c1.cname);
System.out.println(c1.cmodel);
}
}