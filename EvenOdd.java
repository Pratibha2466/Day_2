import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number to check wether it is Even or Odd :");
		n = sc.nextInt();
		
		if(n % 2 == 0)
			System.out.println(n+" is Even");
		else 
			System.out.println(n+" is Odd.");
		
		sc.close();
	}
}