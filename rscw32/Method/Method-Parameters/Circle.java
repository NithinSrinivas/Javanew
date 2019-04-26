class Circle


{
	static void area(int r )
{
	final double pi=3.142;
	double result = pi*r*r;
	System.out.println(result);	
}	
	public static void main(String[] args) 	
{
		System.out.println("****Main Starts***");
		area (5);
		System.out.println("****Main End***");
}
}


/*
{
static void area (final double pi, int r) //Parameter

{
int result=pi*r*r;
System.out.println(result);
}

public static void main (String []args)

{
System.out.println("---Main Starts---");
area (3.142,5); // arguments
System.out.println("---Main Ends---");
}
}*/