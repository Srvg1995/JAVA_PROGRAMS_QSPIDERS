package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	int[]a= {50,30,40,10,25,35};
	Arrays.sort(a);
	System.out.println("Enter the n value from 1 to "+a.length);
	int n=s.nextInt();
	System.out.println(n+"largest element is:");
	System.out.println(a[a.length-n]);
}
}
