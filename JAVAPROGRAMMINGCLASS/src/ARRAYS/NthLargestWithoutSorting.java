package ARRAYS;

public class NthLargestWithoutSorting {

public static void main(String[] args) {

	int[]a= {30,50,20,25,60,10};
	int n=6;
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]>a[i])
			{
				count++;
			}
		}
		if(count==n-1)
		{
			System.out.println(a[i]+"is"+n+"largest element");
		}
	}
}
}

	
	

