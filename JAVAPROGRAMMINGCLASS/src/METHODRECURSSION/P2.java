package METHODRECURSSION;

public class P2 
	{
    public static void main(String[]args)
		 {
			 print(1);
			 
		 }
    
    
	public static void print(int n)
	{
		if(n%2==0)
		{
			System.out.println(n);
		}
		n++;
		if(n<=10)
		{
			print(n);
		}
	}
	}
	


