package STRINGS;

public class SP30Pangram2 {

	public static void main(String[] args) {
		String s1="the quick brown fox jumps over thelazy dog";
		
		int[]res=frequency(s1);
		if(isPangram(res))
		{
			System.out.println("pangram");

		}
		else
		{
			System.out.println("not a pangram");
		}
	}

	public static boolean isPangram(int[] res) {
		for (int i = 0; i < res.length; i++) {
			if(res[i]==0)
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

