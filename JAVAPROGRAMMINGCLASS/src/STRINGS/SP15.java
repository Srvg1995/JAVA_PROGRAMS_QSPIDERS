package STRINGS;

public class SP15 {

		public static void main(String[] args) {

			String s="HELLO";
			char[]ch=s.toCharArray();
			for (int i = 0; i < ch.length; i++) 
			{
				if(ch[i]>='A'&& ch[i]<='Z')
				{
					ch[i]+=32;
					
				}
			}
			String s2 = new String(ch);
			System.out.println(s2);
		}
	}

