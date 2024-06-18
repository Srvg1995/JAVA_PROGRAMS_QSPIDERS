package ARRAYS;

public class A9 {

	public static void main(String[] args) {
		int[]a= {10,25,45,40,60,50,300};
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
			
			}
				System.out.println("Smallest element:"+small);
	}
}

		
