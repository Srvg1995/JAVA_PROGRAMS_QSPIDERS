package STRINGS;

public class SP11 {

	public static void main(String[] args) {
		String s1="Qspiders@123@Qspiders";
		char[]ch=s1.toCharArray();
		int vowel=0; int cons=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&& ch[i]<='z')
			{
				if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'|| ch[i]=='o'||ch[i]=='u'|| ch[i]=='A'||ch[i]=='E'|| ch[i]=='I'||ch[i]=='O'|| ch[i]=='U')
				{
					vowel++;

				}
				else
				{
					cons++;
				}
			}
		}
	
System.out.println("count of vowels:"+vowel);
System.out.println("count of consonants:"+cons);
}
}