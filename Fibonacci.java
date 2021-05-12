package Basics;
import java.util.*;

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of terms needed in the fibonacci series");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int sum;
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<n;i++)
		{
			sum=arr[i-2]+arr[i-1];
			arr[i]=sum;
		}
		
		System.out.println("The fibonacci series is:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
