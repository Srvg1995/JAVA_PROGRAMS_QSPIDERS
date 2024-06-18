package PATTERNS;

public class T3 {   

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			int a=1;
			for(int j=0;j<n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<2*i-1;j++)
			{
				System.out.print(a%2+" ");
				a++;
			}	
			System.out.println();
		}
	}
}	
	
