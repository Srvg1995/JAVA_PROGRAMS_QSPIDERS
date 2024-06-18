package ARRAYS;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Key element");
		int key=s.nextInt();
		int count=0;
		int[]a= {10,15,13,14,17,19,20,21,29,31};
		Arrays.sort(a);
		int low=0;
		int high=a.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if (key==a[mid])
			{
				count++;
				break;
			}
			else if(key>a[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
			}
	
	    if(count==1)
		System.out.println("Key element is present");
	    else
	    System.out.println("Key element not present");
	}

}
