package ARRAYS;

public class A8 {

	public static void main(String[] args) {
		int[]a= {10,25,45,40,60,50,300};
		int large=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
			
			}
				System.out.println("Largest element:"+large);
	}
}

		
