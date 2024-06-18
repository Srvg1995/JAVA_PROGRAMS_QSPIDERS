package PATTERNS;

public class T7 {

	public static void main(String[] args) 
	{
		int n=5;
		int star=1;
		int space=n-1;
		
		for(int i=1;i<n;i++)
		{
			char ch='a';
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			 star++;
		     space--;
	    }
	}
}
		     
		    
	
	
	
