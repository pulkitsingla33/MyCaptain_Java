package Basics;
import java.util.*;

public class SwitchCase
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Pick among the folowing:");
		System.out.println("1.Hi\t2.Hey\t3.Hello");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("You chose Hi");
				break;
		case 2: System.out.println("You chose Hey");
			  break;
		case 3: System.out.println("You chose Hello");
			  break;
		default:System.out.println("Invalid Choice");
		}
	}

}
