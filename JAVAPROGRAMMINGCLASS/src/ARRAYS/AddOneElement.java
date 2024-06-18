package ARRAYS;

import java.util.Scanner;

public class AddOneElement {
 public static void main(String[]args) {
	 
	Scanner s=new Scanner(System.in);
	int[]a= {10,20,30,40};
	System.out.println("Enter the Index");
	int index=s.nextInt();
	System.out.println("Enter the Element");
	int element=s.nextInt();
	int[] res=add(a,index,element);
	for(int i=0;i<res.length;i++)
	{
		System.out.println(res[i]);
	}
}

 public static int[] add(int[]a,int index,int element)
 {
	 if(index<0||index>a.length)
	 {
		 System.out.println("Index out of range");
		 return a;
	 }
 int[]res=new int[a.length+1];
 res[index]=element;
 for(int i=0;i<a.length;i++)
 {
	 if(i<index)
	 {
      res[i]=a[i];
	 }
	 else
	 {
		 res[i+1]=a[i];
 }
 }
 return res;
 }
}

	 