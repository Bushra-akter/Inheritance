package fram;

import java.util.ArrayList;
import java.util.List;

public class array {
	
	public static void main(String[] args) {
		
	/*ArrayList arr=new ArrayList();
	arr.add("bushh");
	arr.add(8);
	
	for(Object i:arr)
	{
		System.out.println(i);
	}*/
	
	/*List lst= new ArrayList();
	lst.add(1);	
	lst.add("Bushra");
	
	for(Object i:lst)
	{
		System.out.println(i.toString());
	}*/
	
	ArrayList<Student>studentList=new ArrayList<Student>();
	Student student2006 =new Student();
	student2006.setStudent_Id(2006);
	student2006.setStudent_name("maruf");
	student2006.setAge(23);
	student2006.setSemester("eight");
	
    studentList.add(student2006);
    
    Student student1965 =new Student();
	student1965.setStudent_Id(1965);
	student1965.setStudent_name("Bushra");
	student1965.setAge(23);
	student1965.setSemester("eight");
	
	studentList.add(student1965);
	
	    
	    Student student1984 =new Student();
		student1984.setStudent_Id(1984);
		student1984.setStudent_name("Sabina");
		student1984.setAge(23);
		student1984.setSemester("eight");
		
		studentList.add(student1984);
		
		
	
		for(Student std:studentList)
		{
			System.out.println(std.getStudent_Id());
			System.out.println(std.getStudent_name());
			System.out.println(std.getAge());
			System.out.println(std.getSemester());
			
			System.out.println("\n");
		}
	
	}

}
