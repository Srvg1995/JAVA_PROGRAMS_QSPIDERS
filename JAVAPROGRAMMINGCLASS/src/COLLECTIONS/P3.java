	package COLLECTIONS;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class P3 {

		public static void main(String[] args) {
			ArrayList<Integer>al=new ArrayList<Integer>();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter 10 integer values");
			for (int i =1; i <=10; i++) {
				int a=s.nextInt();
				al.add(a);
			}
			System.out.println(al);
			int sum=0;
			for(Integer i:al)
			{
				
				sum=sum+i;
			}
			System.out.println(sum);
		}

	}


