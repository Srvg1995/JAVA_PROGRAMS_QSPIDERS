package PATTERNS;

public class T8   //FourTriangle
{
	public static void main(String[] args) 
	{
		int n=9;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(i==0||i==n-1||j==0||j==n-1||i==j||j==n-i-1)
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
	

