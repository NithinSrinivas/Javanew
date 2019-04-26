class IBM
{

static int total()

{ 
int sal= 10000;
int mnth = 12;
int result = sal*mnth;
return result;
}

public static void main (String [] args)

{
int bonus = 20000;
int perannum = total();
int totalsal = perannum + bonus;
System.out.println(totalsal);
}


}

/*------------------------------------------------------

class IBM
{

static int total()
{ 
int sal= 10000;
int mnth = 12;
int bonus = 20000;
int result = (sal*mnth)+ bonus;
return result;
}

public static void main (String [] args)
{
int perannum = total();
System.out.println(perannum);
}

}

*/