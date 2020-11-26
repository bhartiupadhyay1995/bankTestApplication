

public class Account {
	
	private double checkingAccountbalance=0;
	private String accountNumber;
	private String accountType;
	Bank bank=new Bank();

	
	public Account(String accountNumber,String accountType,Double defaultbalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.checkingAccountbalance=defaultbalance;
	}

	public double deposit(double amount, String currencyType) {
		System.out.println("Amount to deposit "+amount);
		System.out.println("Currency is "+currencyType);

		if(currencyType=="CAD") {
			checkingAccountbalance=checkingAccountbalance+amount;
		}
		else {
			checkingAccountbalance=checkingAccountbalance+ bank.CalculateConverstedPrice(amount,currencyType);
		}
	return 	checkingAccountbalance;
	}
	
    public double withdraw(double amount,String currencyType) {
    	System.out.println("Amount to withdraw "+amount);
		System.out.println("Currency is "+currencyType);
           if(amount<checkingAccountbalance) {    	
    	
    	if(currencyType=="CAD") {
    		checkingAccountbalance=checkingAccountbalance-amount;
            	}
    	else {
    		checkingAccountbalance=checkingAccountbalance-bank.CalculateConverstedPrice(amount,currencyType);
    		
    	}}
    	else {
    		System.out.println("Insuffecient balance");
    	}
           return checkingAccountbalance;
		
	}
    
    public double getCheckingAccountBalance() {
		return checkingAccountbalance;
		
	}
    
  

}
