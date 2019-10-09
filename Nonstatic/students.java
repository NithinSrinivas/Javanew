class Students // Display mock rating for both candidates
{

//int man_mock;
int java_mock;


public static void main (String []args)

{
Students std1 = new Students();
std1.java_mock = 1;
System.out.println(std1.java_mock);

Students std2 = new Students();
std2.java_mock = 2;
System.out.println(std2.java_mock);

std2.java_mock=1;
System.out.println(std2.java_mock);

}

}
