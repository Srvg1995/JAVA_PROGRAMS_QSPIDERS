package COLLECTIONS;

import java.util.ArrayList;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10 integer values");
		for (int i =1; i <=10; i++) {
			int a=s.nextInt();
			al.add(a);
		}
		System.out.println(al);
		int sum=0;
		for(Object o:al)
		{
			Integer i=(Integer)o;
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
