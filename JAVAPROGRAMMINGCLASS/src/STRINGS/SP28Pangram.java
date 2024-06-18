package STRINGS;

public class SP28Pangram {

	public static void main(String[] args) {
		String s="the quick brown fox jumps over lazy dog";
		s=s.toUpperCase();
		char[]ch=s.toCharArray();
		int count=0;
		for (char c='A';c<='Z';c++)
		{
			for (int i = 0; i < ch.length; i++) {
				if(c==ch[i])
				{
					count++;
					break;
				}
			}
		}

		if(count==26)
			System.out.println("pangram");
		else
		{
			System.out.println("not pangram");
		}
	}
}

