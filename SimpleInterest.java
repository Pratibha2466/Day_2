import java.util.Scanner;

public class SimpleInterest 
{
	public static void main(String[] args) 
	{
		int p,t; //p= Principal , r= Rate of interest ,t= Time period
		float r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal value :");
		p = sc.nextInt();
		
		System.out.println("Enter Rate of interest :");
		r = sc.nextFloat();
		
		System.out.println("Enter Time period in year :");
		t = sc.nextInt();
		
		System.out.println("Simple Interest :"+ (p*r*t));
		
		sc.close();
	}
}
