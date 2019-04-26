class Rectangle
{
static void area ()
{
int w = 7;
int h = 7;
int result = w*h;
System.out.println (result );
}

public static void main (String []args)
{
System.out.println("***Main Starts***");
area ();
System.out.println("***Main Ends***");
}
}


/*C:\Users\NITHIN\rscw32\Method>javac Rectangle.java
Rectangle.java:7: error: cannot find symbol
result = w*h;
^
  symbol:   variable result
  location: class Rectangle
Rectangle.java:8: error: cannot find symbol
System.out.println (result );
                    ^
  symbol:   variable result
  location: class Rectangle
2 errors
*/