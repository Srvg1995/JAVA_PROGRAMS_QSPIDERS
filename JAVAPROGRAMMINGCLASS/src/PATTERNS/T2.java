package PATTERNS;

public class T2 {   //DIAMOND

	public static void main(String[] args) 
	{
		int n=5;
		int star=1;
		int space=n/2;
		char ch='a';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");  //double space
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			if(i<=n/2)
			{
				star+=2;
			    space--;
		    }
		    else 
		    {
		     star-=2;
		     space++;
		    }
		}
	}
}

		     
		    
	
	
	
