package STRINGS;

public class P3 {
public static void main(String[] args) {
	String s="hi@123";
	char[]ch=s.toCharArray();
	int sum=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='0'&& ch[i]<='9')
		{
			sum=sum+(ch[i]-48);
		}
	}
System.out.println(sum);
}
}

