package ARRAYS;

public class PrimeNumber {
	public static void main(String[] args) {
		int[]a= {10,15,13,14,17,19,20,21,29,31};
		for(int j=0;j<a.length;j++)
		{
			int n=a[j];
			int count=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					count++;
					break;
				}
			}
		    if(count==0)
		     {
			  System.out.println(n);
	         }
		}
	}
}
		
	


