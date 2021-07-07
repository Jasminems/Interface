/*A Java program to create an interface with static final variable*/
interface B
{
	int a=10;
	static final int b=20;
	final int c=30;
	static int d=50;
}
public class A implements B
{
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
