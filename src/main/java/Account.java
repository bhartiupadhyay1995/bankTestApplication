import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Account {
	
	
	private double checkingAccountbalance=0;
	private String accountNumber;
	Map<String, Float> accountTypeBalnce=new HashMap<String,Float>();
	//private String[] accountType;
	Bank bank=new Bank();

	
	public Account(String accountNumber,String accountType,Double defaultbalance, Float amount) {
		super();
		this.accountNumber = accountNumber;
		this.accountTypeBalnce.put(accountType,amount);
		this.checkingAccountbalance=defaultbalance;
	}

	public double deposit(Float amount, String currencyType,HashMap<String, Float> details) {
		System.out.println("Amount to deposit "+amount);
		System.out.println("Currency is "+currencyType);
		Iterator it = details.entrySet().iterator();
		 while (it.hasNext()) {
			 Map.Entry pair = (Map.Entry)it.next();
		 
		if(pair.getKey()== "Checkings")
          {
		if(currencyType=="CAD") {
			pair.setValue(pair.getValue()+amount);
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
    
    
    public double transferFunds(double amount,String currencyType) {
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
    
    
    public void transferAmount(HashMap<String,Float> From,HashMap<String,Float> To ) {
  		
  		
  	}
    
  
    
    
    
    

}
