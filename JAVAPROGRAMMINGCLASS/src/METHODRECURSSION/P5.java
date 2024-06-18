package METHODRECURSSION;

public class P5
	{
    public static void main(String[]args)
		 {
			 factorial(5,1);
			 
		 }
    
    
	public static void factorial(int n,int fact)
	{
		fact*=n;
		n--;
		if(n==0)
		{
			System.out.println(fact);
		}
		if(n>0)
		{
			factorial(n,fact);
		}
	}
	}

		
	


