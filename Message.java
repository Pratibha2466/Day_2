import java.util.Scanner;

public class Message 
{
	public static void main(String[] args) 
	{
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name :");
		name = sc.next();
		
		System.out.println("Hi "+name+ ". \nWelcome to DY patil.");
		
		sc.close();
	}
}