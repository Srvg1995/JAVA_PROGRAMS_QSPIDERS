package STRINGS;

import java.util.Scanner;

public class SP23Swap2StringsWithoutTemp {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 strings");
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	System.out.println("before swapping");
	System.out.println("s1:"+s1);
	System.out.println("s2:"+s2);
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println(("after swapping"));
	System.out.println("s1:"+s1);
	System.out.println("s2:"+s2);
}
}