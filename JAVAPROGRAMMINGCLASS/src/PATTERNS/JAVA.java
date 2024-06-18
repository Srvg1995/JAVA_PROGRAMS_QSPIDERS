package PATTERNS;

public class JAVA {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) //J
			{
				if(i==0||j==n/2||i==n-1&&j<=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				}
			System.out.print(" ");
			
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
			System.out.print(" ");
			
			for(int j=0;j<n;j++)//V
			{
				if(j==0&& i<=n/2||j==n-1&&i<=n/2||i==3&&j==1||i==3&&j==3||i==4&&j==2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				}
			System.out.print(" ");
			
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


