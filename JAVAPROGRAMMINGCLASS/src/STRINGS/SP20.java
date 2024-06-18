package STRINGS;

import java.util.Scanner;

public class SP20 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	char[]ch=s.toCharArray();
	int digit=0;
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]>='0'&& ch[i]<='9')
		{
			digit++;
		}
	}
	if(s.length()==digit)
		System.out.println("string contains only digits");
	else
	{
		System.out.println("string does not contains only digits");
	}
}
}
