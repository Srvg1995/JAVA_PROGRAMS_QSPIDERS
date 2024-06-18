package MULTIDIMENTIONALARRAY;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the row size");
		int row=s.nextInt();
		System.out.println("enter the column size");
		int col=s.nextInt();
		int[][]a=new int[row][col];
		System.out.println("enter "+(row*col)+" elements");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("the entered elements are");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
