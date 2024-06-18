package ARRAYS;

import java.util.Scanner;

public class ProductPrice {

	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total number of prices");
		int n=s.nextInt();
		double[]a=new double[n];
		System.out.println("Enter"+n+"Prices");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextDouble();
		}
		double sum=0;

		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/n;
		System.out.println("Average:"+avg);
		
		
	}
}
