package ARRAYS;

public class A6 {

	public static void main(String[] args) {
		int[]a= {1,3,5,6,2,7};
		int[]b= {1,3,5,6,2,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++) {
				if(a[i]>=b[j] || a[i]<=b[j])
				{
					System.out.println("largest="+a[i]);
				}
			
					System.out.println("smallest="+b[j]);
				}
			}
		}}}

