/*A Java program to create private or protected interfaces*/
interface A
{
	private void add();//complie-time errors
	protected int i=10;
}
public class Interpriprotect
{
	public static void main(String[] args) 
	{
		
		Interpriprotect n=new Interpriprotect();
		n.add();
	}

}
