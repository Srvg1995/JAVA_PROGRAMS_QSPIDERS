package STRINGS;

public class SP13 {
	public static void main(String[] args) {

		String s="Qspiders@123";
		int digit=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				digit++;
			}
		}
		System.out.println("count of digits:"+digit);
	}
}