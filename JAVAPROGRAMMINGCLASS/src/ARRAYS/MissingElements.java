
package ARRAYS;

public class MissingElements {
	public static void main(String[] args) {
		int[]a= {1,2,3,5,7,10};
		for(int key=1;key<=10;key++)
		{
			int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				count++;
				break;
			}
		}
       if(count==0)
    {
	System.out.println(key);
    }
   }
  }
}

