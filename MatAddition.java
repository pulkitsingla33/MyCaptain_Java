package Basics;
import java.util.*;

public class MatAddition
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of rows and columns of the arrays");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int i,j,k;
		for(i=1;i<=2;i++)
		{
			if(i==1)
				System.out.println("Enter values for matrix 1");
			else
				System.out.println("Enter values for matrix 2");
			
			for(j=0;j<r;j++)
			{
				for(k=0;k<c;k++)
				{
					if(i==1)
						a[j][k]=sc.nextInt();
					else
						b[j][k]=sc.nextInt();
				}
				
			}
		}
		
		int sum[][]=new int[r][c];
		for(j=0;j<r;j++)
		{
			for(k=0;k<c;k++)
			{
				sum[j][k]=a[j][k]+b[j][k];
				System.out.print(sum[j][k]+"\t");
			}
			System.out.println();
		}
		
	}
}
