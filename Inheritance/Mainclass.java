class Demo1
{
int x = 50;
}
class Demo2 extends Demo1
{
void disp()
	{
System.out.println("Hello");
}
}
class Demo3 extends Demo2
{
int y = 64;
}

class Demo4 extends Demo1
{
int y = 64;
}


class Mainclass
{
public static void main (String []args)
{
Demo3 d1 = new Demo3 ();
Demo4 d2 = new Demo4 ();
System.out.println(d1.x);
System.out.println(d1.y);
System.out.println(d2.x);
System.out.println(d2.y);
d1.disp();
}
}

