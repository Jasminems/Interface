/*A Java program to interface with 2 methods and implement only one method*/
interface MyInterf
{
	public void m1();
	public void m2();
}
class Demo implements MyInterf
{
	//Implementing only one method
	public void m1()
	{
		System.out.println("Implementation of m1");
	}
}
public class Interftwo 
{
		public static void main(String[] args)
		{
		MyInterf ob=new Demo();
		//calling the implemented method
		ob.m1();
		}
}
