import java.util.*;
class Age
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int age=sc.nextInt();
		
		if(age>18)
		{
			System.out.println("You are eligible");
		}
		else
		{
			System.out.println("You are not eligible");
		}
		System.out.println("Program done");
	}
}
