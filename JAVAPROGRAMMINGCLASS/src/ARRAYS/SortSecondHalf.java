package ARRAYS;

import java.util.Arrays;

public class SortSecondHalf {
public static void main(String[] args) {
	int[]a= {25,30,15,10,22,30,12,14,5};
	Arrays.sort(a,a.length/2,a.length);
    for(int i=0;i<a.length;i++)
    {
    	System.out.print(a[i]+" ");
    }
	
}
}
