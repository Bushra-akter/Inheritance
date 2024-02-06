package practise;

import java.util.HashSet;
import java.util.Set;

import fram.Student;

public class BankDriverClass {

	public static void main(String[] args) {
		
		 Bank bank1 =new Bank(1, "Agrani Bank");
		 Employee emp1=new Employee(1, "A", "ICT");
		 Employee emp2=new Employee(2, "B", "ICT");
		 
		 Set<Employee>employees=new HashSet<Employee>();
		 employees.add(emp1);
		 employees.add(emp2);
		 bank1.setEmployees(employees);
		 
		 
		 System.out.println(bank1.getBankId());
		 System.out.println(bank1.getBankName());
		 
		 for(Employee std:employees)
			{
				System.out.println(std.getEmployeeId());
				System.out.println(std.getEmployeeName());
				
				System.out.println(std.getEmployeeDept());
				
				System.out.println("\n");
			}
		 //System.out.println(bank1.getemployees());
		
		 
		/* Bank bank2 =new Bank(2, "grameen Bank");
		 Employee emp3=new Employee(1, "A", "ICT");
		 Employee emp4=new Employee(2, "B", "ICT");
		 
		 Set<Employee>employees1=new HashSet<Employee>();
		 employees1.add(emp3);
		 employees1.add(emp4);
		 bank2.setEmployees(employees1);*/
		 
		 
		 
		 
		 
	}

}
