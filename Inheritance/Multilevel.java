class Multilevel //Multilevel Inheritance
{
int x = 50;
}
class Demo2 extends Multilevel
{
void disp()
}
System.out.println("Hello");
}
}
class Demo3 extends Demo2
{
int y = 64;
}

class Mainclass
{
public static void main (String []args)
{
Demo3 d1 = new Demo3 ();

System.out.println(d1.x);
System.out.println(d1.y);
d1.disp();

}
}

