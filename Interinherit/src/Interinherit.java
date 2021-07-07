/* A Java program to create an interface and inherit from other interface*/
interface Int1
{
	void m1();
}
//Inherit from other Interfaces
interface Int2 extends Int1
{
	void m2();
}
public class Interinherit implements Int2
{
	public void m1()
	{
		System.out.println("Hello");
	}
	public void m2()
	{
		System.out.println("Java Program");
	}
	public static void main(String[] args) 
	{
		Interinherit i=new Interinherit();
		i.m1();
		i.m2();

	}

}
