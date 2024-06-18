package STRINGS;

import java.util.Iterator;
import java.util.Scanner;

public class SP19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password");
		String s=sc.nextLine();
		if (s.length()>=8 && s.length()<=16) {
			int up=0; int low=0;int digit=0;int space=0;
			int spe=0;
			char[]ch=s.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				System.out.println(ch[i]);
				if(ch[i]>='A' && ch[i]<='Z')
				{
					up++;
				}
				else if(ch[i]>='a'&& ch[i]<='z')
				{
					low++;
				}
				else if(ch[i]>='0'&& ch[i]<='9')
				{
					digit++;
				}
				else if(ch[i]==' ')	
				{
					space++;
				}
				else
				{
					spe++;
				}
			}
			if(up>=1 && low>=1 && digit>=1 && space==0 && spe>=1)
			{
				System.out.println("valid password");
			}
			else
			{
				System.out.println("not a valid password");
			}
		}
		else
		{
			System.out.println("password length is not in range");
			System.out.println("It should have min 8 to 16 characters");
		}
	}

}
