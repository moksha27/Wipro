import java.util.*;
class Alpha
{
	public static void main(String args[])
		{
			char first,second;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a char1");
			char a=sc.next().charAt(0);
			System.out.println("enter a char2");
			char b=sc.next().charAt(0);
			if(a>b)
			{
				first=b;
				second=a;
			}
			else
			{
				first=a;
				second=b;
			}
			
				 System.out.println("First character: " + first);
       				 System.out.println("Second character: " + second);
}
}
