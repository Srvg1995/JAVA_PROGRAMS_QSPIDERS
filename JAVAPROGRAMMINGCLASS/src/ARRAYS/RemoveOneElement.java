package ARRAYS;

import java.util.Scanner;

public class RemoveOneElement {
 public static void main(String[]args) {
	 
	Scanner s=new Scanner(System.in);
	int[]a= {10,20,25,30,40};
	System.out.println("Enter the Index");
	int index=s.nextInt();
	
	int[] res=remove(a,index);
	for(int i=0;i<res.length;i++)
	{
		System.out.println(res[i]);
	}
}

 public static int[] remove(int[]a,int index)
 {
	 if(index<0||index>=a.length)
	 {
		 System.out.println("Index not in the range");
		 return a;
	 }
 int[]res=new int[a.length-1];
 
 for(int i=0;i<res.length;i++)
 {
	 if(i<index)
	 {
      res[i]=a[i];
	 }
	 else
	 {
		 res[i]=a[i+1];
 }
 }
 return res;
 }
}

	 