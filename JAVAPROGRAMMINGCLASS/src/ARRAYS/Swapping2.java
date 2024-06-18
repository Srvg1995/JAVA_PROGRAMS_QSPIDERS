package ARRAYS;

import java.util.Scanner;

public class Swapping2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 integer values");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Before Swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
