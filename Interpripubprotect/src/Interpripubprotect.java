/*A Java program to create an interface with private,public and protected fields*/
interface Add
{
	protected int a=10;
	private int b=20;	//complie-time errors
	public void add();
}
public class Interpripubprotect implements Add
{
	public void add()
	{
		System.out.println("Addition:"+(a+b));
	}
	public static void main(String[] args) 
	{
		Interpripubprotect ob=new Interpripubprotect();
		ob.add();
	}
}