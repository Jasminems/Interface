/*A Java program 2interfaces with 1 method each.Implement the 2 interfaces in one class*/
interface MyInt1
{
	public String s="Hello";
	public void print();
}
interface MyInt2
{
	public void print1();
}
public class Interimplen implements MyInt1,MyInt2
{
	public void print();
	public void print1();
	public static void main(String[] args)
	{
		System.out.println("Hello");
		System.out.println("Java Program");
	}
}