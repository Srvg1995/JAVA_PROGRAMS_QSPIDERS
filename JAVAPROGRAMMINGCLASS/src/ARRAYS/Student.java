package ARRAYS;

public class Student {

	String name;
    int id;
    int age;
    
    Student()
    {
    	
    }
	public Student(String name,int id,int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void display()
	{
		System.out.println("Student Details");
		System.out.println("Student Name:"+name);
		System.out.println("Student Id:"+id);
		System.out.println("Student Age:"+age);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
	}
}
    
	
		
