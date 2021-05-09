package Basics;

public class Employee
{
	public String name (int i)
	{
		if(i==1)
			return "Robert";
		else if(i==2)
			return "Sam";
		else if (i==3)
			return "John";
		else
			return null;
	}
	
	public int year(int i)
	{
		if(i==1)
			return 1994;
		else if(i==2)
			return 2000;
		else if (i==3)
			return 1999;
		else
			return 0;
	}
	
	public int salary(int i)
	{
		if(i==1)
			return 75000;
		else if(i==2)
			return 50000;
		else if (i==3)
			return 55000;
		else
			return 0;
	}
	
	public String address(int i)
	{
		if(i==1)
			return "64C-WallsStreet";
		else if(i==2)
			return "68D-WallsStreet";
		else if (i==3)
			return "26B-WallsStreet";
		else
			return null;
	}
	
	public static void main(String[] args)
	{
		Employee obj=new Employee();
		String nm,add;
		int yr,salry;
		
		System.out.println("Name\tYear of Joining\tSalary\tAddress");
		for(int i=1;i<=3;i++)
		{
			nm=obj.name(i);
			yr=obj.year(i);
			salry=obj.salary(i);
			add=obj.address(i);
			
			System.out.println(nm+"\t\t"+yr+"\t$"+salry+"\t"+add);
		}
	}
}
