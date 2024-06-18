package ARRAYS;

import java.util.Arrays;

public class FirstToNthLargest {
	public static void main(String[] args) {
		int[]a= {50,30,40,10,25,35};
		Arrays.sort(a);
		for(int n=1;n<=a.length;n++)
		{
			System.out.println(n+"largest element is:"+a[a.length-n]);
		}
	}

}
