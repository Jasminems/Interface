/*A Java program to create a public interface*/ 
interface Add
{
	//fields and methods
	public int a=10;
	public int b=20;
	public void add();
}
public class Interpublic implements Add
{
	public void add()
	{
		//printing the values of interface fields
		System.out.println("Value of A:"+a);
		System.out.println("Value of B:"+b);
		System.out.println("Addition:"+(a+b));
	}
	public static void main(String[] args) 
	{
		Interpublic ob=new Interpublic();
		//calling the interface method
		ob.add();
	}
}
