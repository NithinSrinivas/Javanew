class Bike
{
void stage1()//non static
{
System.out.println("Bike is manufactured");
}
}
class Final
{
public static void main (String []args)
{
Bike s1 = new Bike();
Stage2.entry(s1);
Stage3.entry(s1);
Stage4.entry(s1);
/*Stage5.entry(s1);
Stage6.entry(s1);*/
}
}

class Stage2
{
static void entry (Bike s2)
{
s2.stage1();
}
}

class Stage3
{
	static void entry (Bike s3)
	{
		s3.stage1();
	}
}

class Stage4
{
	static void entry(Bike s4)
	{
		s4.stage1();
	}
}