/*A Java program to use interfaces instances to call the implemented method*/
public interface MyInterf
{
	public String h="Hello";
	public void sayHello();
}
public class Inteimple implements MyInterf
{
	public void sayHello() 
	{
		System.out.println(MyInterf.h);
	}
	public static void main(String[] args) 
	{
		MyInterf m=new Inteimple();
		//calling the implemented method
		m.sayHello();
		
	}
}
