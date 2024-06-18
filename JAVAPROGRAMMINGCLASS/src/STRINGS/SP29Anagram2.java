package STRINGS;

import java.util.Iterator;

public class SP29Anagram2 {
	public static void main(String[] args) {
		String s1="race";
		String s2="care";
		int[]a=frequency(s1);
		int[]b=frequency(s2);
		boolean res=isAnagram(a,b);
		if(res)
		{
			System.out.println("anagram");

		}
		else
		{
			System.out.println("not an anagram");
		}
	}

	public static boolean isAnagram(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=b[i])
			{
				return false;
			}
		}
		return true;
	}


	public static int[] frequency(String s) {
		char[]ch=s.toCharArray();
		int[]a=new int[26];
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A'&& ch[i]<='Z')
			{
				int index=ch[i]-65;
				a[index]++;
			}
			else if(ch[i]>='a'&& ch[i]<='z')
			{
				int index=ch[i]-97;
				a[index]++;
			}
		}
		return a;
	}
}

