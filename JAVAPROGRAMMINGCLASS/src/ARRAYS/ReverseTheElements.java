package ARRAYS;

public class ReverseTheElements { 
	public static void main(String[] args) {
		int[]a= {30,50,20,25,60,10};
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
System.out.println("After Reversing");
for(int k=0;k<a.length;k++)
{
	System.out.print(a[k]+" ");
}
	}
}