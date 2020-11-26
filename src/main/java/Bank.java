

public class Bank {
	
	private double pesosToCAD=0.065;
	private double usdToCAD=1.30;
	//private Customer[] customers= new Customer[1000];
	
	
	
	public double CalculateConverstedPrice(double amount,String currenctType) {
		
		double convertedPrice=0;; 
		if(currenctType=="USD") {
			System.out.println("Amount in USD: "+ amount);
			convertedPrice= amount*usdToCAD;
		}
		else {
			System.out.println("Amount in Pessos: "+ amount);

			convertedPrice=amount*pesosToCAD;
		}
		return convertedPrice;
	}
	
	
	public double calculateForeignWithdrawAmount(double amount,String currenctType) {
		double foreignAmount; 
		if(currenctType=="USD") {
			foreignAmount= amount/usdToCAD;
		}
		else {
			foreignAmount=amount/pesosToCAD;
		}
		return foreignAmount;
	}
	

    public void transfer() {


    }

}