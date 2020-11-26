

public class Customer {
	
	private String customerName;
	private Account account;
	private String[] AccountTypes;
	
	


	public Customer(String customerName, Account account, String[] accountTypes) {
		super();
		this.customerName = customerName;
		this.account = account;
		AccountTypes = accountTypes;
	}
	
	public void displayInfo() {
		System.out.println("CustomerName-"+customerName+" AccountBalance-"+account.getCheckingAccountBalance());
	}

	public String getcustomerName() {
		return customerName;
		
	}
	
	public Account getAccount() {
		return account;
		
	}
}
