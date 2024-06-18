package PATTERNS;

public class B
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)//A
			{
				if(j==0||i==0&&j!=n-1||i==n/2||j==n-1&&i!=0&&i!=n-1||i==n-1&&j!=n-1)
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
