package practise;

import java.util.Set;

public class Bank {
	
	private int bankId;
	private String bankName;
	
	private Set<Employee> employees;

	public Bank(int bankId, String bankName) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
	}

	public int getBankId() {
		return bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	
	

}
