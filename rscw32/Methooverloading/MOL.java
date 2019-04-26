class whatsapp
{
static void send (int num)
{
System.out.println( num );
}

static void send (String msg )
{
System.out.println(msg);
}


static void send (int num, String s )
{
System.out.println("String msg and int no");
}
}


class MOL 
	{
public static void main (String []args)
{
//whatsapp a1 = new whatsapp();
whatsapp.send(123);
whatsapp.send("hello");
whatsapp.send(123,"hello");
}
}
