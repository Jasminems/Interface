/*A Java program to create an Interface with default method*/
interface Int1
{
	public void s(int a);
	//default method
	default void show()
	{
		System.out.println("Default method executed");
	}
}
class Test implements  Int1
{
	public void s(int a) 
	{
		System.out.println(a*a);
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.s(6);
		t.show();
	}

}
