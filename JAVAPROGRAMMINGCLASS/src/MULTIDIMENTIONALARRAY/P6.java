package MULTIDIMENTIONALARRAY;

public class P6 {

	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6}};
		int[][]res=new int[a[0].length][a.length];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j]=a[j][i];
			}

		}
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j]+" ");	
			}
			System.out.println();
		}
	}
}