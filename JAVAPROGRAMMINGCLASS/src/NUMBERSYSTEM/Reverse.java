package NUMBERSYSTEM;

	import java.util.Scanner;
	public class Reverse 
	{
		public static void main(String[]args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter an integer number");
			int n=s.nextInt();
			int rev=0;
			while(n>0)
			{
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
        System.out.println(rev);
		}
}
