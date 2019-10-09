class School
{
int sid;
String Sname;
String Sgrade;
int Sstrength;
School( int a, String b, String c, int d)
{
sid = a;
Sname = b;
Sgrade = c;
Sstrength = d;
}

public static void main (String [] args )
{
School s1 = new School (1,"Florence","VII",59);
System.out.println(s1.sid);
System.out.println(s1.Sname);
System.out.println(s1.Sgrade);
System.out.println(s1.Sstrength);
}
}