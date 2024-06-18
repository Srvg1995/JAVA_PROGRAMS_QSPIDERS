package METHODRECURSSION;

public class P4 
	{
    public static void main(String[]args)
		 {
			 sum(1,0);
			 
		 }
    
    
	public static void sum(int i,int sum)
	{
		sum+=i;
		i++;
		if(i<=5)
		{
	     sum(i,sum);
		}
        if(i>5)
        {
    	System.out.println(sum);
        }
	}
	}
