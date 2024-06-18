package ARRAYS;

import java.util.Arrays;

public class SortMethod {
	public static void main(String[] args) {
		int[]a= {30,20,10,15,35,5};
		System.out.println("Before Sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("After Sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
		
		
		