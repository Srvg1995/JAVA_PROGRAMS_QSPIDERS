package METHODRECURSSION;

public class P1 {
	public static void main(String[]args)
	{	
test(1);
}
public static void test(int n)
{
	System.out.println(n);
	n++;
	if(n<=5)
	{
		test(n);
	}
}
}