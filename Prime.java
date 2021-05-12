package Basics;
import java.util.*;

public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a no. to check whether it is prime or not");
		num=sc.nextInt();
		
		int i,flag=0;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag++;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("The no.is prime");
		else
			System.out.println("The no. is not prime");
		
	}
}
