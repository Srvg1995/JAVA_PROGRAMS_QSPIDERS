package PATTERNS;

public class GAGAN {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)//G
			{
				if(i==0||j==0||j==n-1&&i>=n/2||i==n-1||i==2&&j!=1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				 }
			System.out.print("  ");
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
			System.out.print("  ");
	
			for(int j=0;j<n;j++)//G
			{
				if(i==0||j==0||j==n-1&&i>=n/2||i==n-1||i==2&&j!=1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				 }
			System.out.print("  ");
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
		System.out.print("  ");
		for(int j=0;j<n;j++)//N
		{
			if(j==0||i==j||j==n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			 }
		System.out.println();
	}
}
}
