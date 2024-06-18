package PATTERNS;

public class N
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
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
