class Buy
{
void eating ()
{
System.out.println("Baby asking for chips");
}
}
class Dad
{
public static void main (String []args)
{
Buy e1 = new Buy();
Baby.needchips(e1);
Baby2.needchips(e1);
}
}

class Baby
{
static void needchips( Buy e1)
{
e1.eating();
}
}

class Baby2
{
static void needchips( Buy e2)
{
e2.eating();
}
}