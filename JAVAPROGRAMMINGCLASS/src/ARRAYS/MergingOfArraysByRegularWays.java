package ARRAYS;

public class MergingOfArraysByRegularWays {

	public static void main(String[] args) {
		int[]a={10,30,50,70};
		int[]b={20,40,60,80};
		int[]res=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			res[a.length+i]=b[i];
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	
	}
}
