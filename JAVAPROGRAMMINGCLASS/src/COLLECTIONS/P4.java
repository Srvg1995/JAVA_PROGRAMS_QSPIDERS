package COLLECTIONS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class P4 {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(50);
		System.out.println("By using get(int index)");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}
		System.out.println("By using for each loop");
		for(Integer i:al)
		{
			System.out.println(i);
		}
		System.out.println("By using iterator()");
		Iterator<Integer> i=al.iterator();
		while(i.hasNext());
		{
			System.out.println(i.next());
		}
		System.out.println("By using listIterator()");
		ListIterator<Integer>l=al.listIterator();
		System.out.println("Forward direction");
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println("reverse direction");
		while(l.hasPrevious())
		{
			System.out.println(l.previous());

		}
	}

}