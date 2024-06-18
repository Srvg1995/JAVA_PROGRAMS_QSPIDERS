package STRINGS;

public class SP10 {

	public static void main(String[] args) {
		String s1="hello@12345";
		char[]ch=s1.toCharArray();
		int length=0;
		for(char c:ch) {
			length++;

		}
		System.out.println("length of string:"+length);
	}

}
