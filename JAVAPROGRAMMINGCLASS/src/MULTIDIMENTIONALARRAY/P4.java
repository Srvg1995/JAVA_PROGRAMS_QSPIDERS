package MULTIDIMENTIONALARRAY;

public class P4 {

	public static void main(String[] args) {
int[][]a= {{10,20,5,300},{50,25,40},{100,80,25}};
int large=a[0][0];
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a[i].length; j++) {
		if(a[i][j]>large)
		{
			large=a[i][j];
		}
	}
}
System.out.println(large);
	}

}
