/*A Java program to interface with one method and implement it*/
interface prints 
{
	void print();
}
class A implements prints
{
	//Implement the method in class
	public void print()
	{
		System.out.println("Hello");
	}
}
public class Interfone 
{
	public static void main(String[] args) 
	{
		prints ob=new A();
		//calling the implemented method
		ob.print();
	}
}
