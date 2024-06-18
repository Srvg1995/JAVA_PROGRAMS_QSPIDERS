package STRINGS;

public class SP25 {
public static void main(String[] args) {
String s="one two three";
String []arr=s.split(" ");
String result="";
for (int i=0; i<arr.length; i++) {
	String temp=arr[i];
	char[]ch=temp.toCharArray();
	String rev="";
	for (int j= ch.length-1;j>=0; j--) {
		rev=rev+ch[j];
		
	}
result=result+rev+" ";
}
System.out.println(result);
	}

}
