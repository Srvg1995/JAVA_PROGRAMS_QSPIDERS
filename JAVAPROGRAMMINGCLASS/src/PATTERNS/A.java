package PATTERNS;

public class A
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)//A
			{
				if(i==0||j==0||j==n-1||i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				 }
			System.out.println(" ");
		}
	}
}
