/*A Java program 2Interfaces with same method*/
interface A
{
	public void print();
}
interface B
{
	public void print();
}
//Implementing 2 interfaces
public class Intersme implements A,B
{
	public void print();
	public static void main(String[] args)
	{
		System.out.println("Hello");
	}

}
