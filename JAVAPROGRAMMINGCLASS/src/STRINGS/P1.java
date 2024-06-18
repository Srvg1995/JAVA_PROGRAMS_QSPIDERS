package STRINGS;
import java.util.Scanner;
public class P1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		System.out.println("Enter a Character");
		char c=sc.next().charAt(0);
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				ch[i]=c;
			}
		}
		String s2=new String(ch);
		System.out.println(s2);
	}

}
