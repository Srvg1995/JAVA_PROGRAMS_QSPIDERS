package PATTERNS;

public class G
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)//N
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
			System.out.println();
		}
	}
	
	
}
