package ARRAYS;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {

Scanner s=new Scanner(System.in);
System.out.println("Enter the n value");
int n=s.nextInt();
System.out.println(n);
int[]a=new int[n];
System.out.println("Enter "+n+"integer elements");
  for(int i=0;i<a.length;i++)
  {
	 a[i]=s.nextInt();
  }
	  System.out.println("Entered elements are");
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.println(a[i]);
  }
	}
}


