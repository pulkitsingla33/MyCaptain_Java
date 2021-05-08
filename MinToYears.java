package Basics;
import java.util.*;

public class MinToYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long totalmins;
		System.out.println("Enter Total Minutes");
		totalmins=sc.nextLong();
		
		int years,days,totaldays;
		totaldays=(int)totalmins/(60*24);
		years=totaldays/365;
		days=totaldays%365;
		
		System.out.println(totalmins + " minutes is approximately " + years + " years and " + days + " days");
		
	}
}
