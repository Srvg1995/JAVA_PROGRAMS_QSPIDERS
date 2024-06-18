package STRINGS;

public class SP12 {
	public static void main(String[] args) {

		String s1="Qspiders@123";
		int digit=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			if(ch>'0'&& ch<='9')
			{
				digit++;
			}
		}
		System.out.println("count of digits:"+ digit);
	}
}
