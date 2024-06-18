package ARRAYS;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student[]s=new Student[5];
		s[0]=new Student("Dingi",1,24);
		s[1]=new Student("Dinga",2,23);
		s[2]=new Student("Varun",3,30);
		s[3]=new Student("Pradeep",4,33);
		s[4]=new Student("Sindhu",5,20);
		
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
		
		}

}
