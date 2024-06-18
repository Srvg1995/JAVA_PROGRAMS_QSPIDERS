package ARRAYS;

import java.util.Scanner;
public class MergingOfArraysByMethods {

	public static void main(String[] args) {
		int[]a=toRead();
		int[]b=toRead();
		int[]res=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			res[a.length+i]=b[i];
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	
	}

	private static int[] toRead() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of the Array");
		int n =s.nextInt();
		int []a=new int[n];
		System.out.println("Enter"+n+"Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
	     return a;
	}
}
	
	


